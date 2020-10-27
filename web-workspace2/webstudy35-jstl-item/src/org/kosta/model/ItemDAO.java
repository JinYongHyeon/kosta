package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class ItemDAO {
	private static ItemDAO instance = new ItemDAO();
	private DataSource datasource;

	private ItemDAO() {
		datasource = DataSourceManager.getInstance().getDataSource();
	}

	public static ItemDAO getInstance() {
		return instance;
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con !=null)
			con.close();
	}
	
	public ArrayList<ItemDTO> getAllItemList() throws SQLException{
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = datasource.getConnection();
			String sql = "SELECT item_no,name,maker FROM ITEM";
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setItemNo(rs.getNString("item_no"));
				dto.setName(rs.getNString("name"));
				dto.setMaker(rs.getNString("maker"));
				list.add(dto);
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return list;
	}
	
	public ItemDTO getDetailItem(String itemNo) throws SQLException {
		ItemDTO dto = null;
		Connection con =null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		try {
			con = datasource.getConnection();
			String sql = "SELECT item_no,name,maker,price,detail FROM ITEM WHERE item_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, itemNo);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				 dto = new ItemDTO(rs.getString("item_no"),rs.getString("name"),rs.getString("maker"),rs.getInt("price"),rs.getString("detail"));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return dto;
	}
	
	public void registerItem(ItemDTO dto) throws SQLException {
		Connection con =null;
		PreparedStatement pstmt=null;
		try {
			con =datasource.getConnection();
			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO item(item_no,name,maker,price,detail)");
			sb.append(" VALUES(item_seq.nextval,?,?,?,?)");
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMaker());
			pstmt.setInt(3, dto.getPirce());
			pstmt.setString(4, dto.getDetail());
			pstmt.executeUpdate();
		}finally {
			closeAll(null, pstmt, con);
		}
	}
}
