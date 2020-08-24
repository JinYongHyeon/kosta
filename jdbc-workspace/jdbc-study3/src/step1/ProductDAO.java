package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * DAO : Data Access Object
 * 데이터베이스 연동 로직을 정의한 객체
 */
public class ProductDAO {
	private String drive = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String id = "scott";
	private String pw = "tiger";

	/*
	 * 생성자에서 드라이버 로딩
	 */
	public ProductDAO() throws ClassNotFoundException {

		Class.forName(drive);

	}

	public void closeAll(PreparedStatement pstm, Connection con) throws SQLException {
		if (pstm != null)
			pstm.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstm, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstm, con);
	}

	/**
	 * SELECT WHERE ID 검색
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public ProductDTO findProductById(String id) throws SQLException {
		ProductDTO dto = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, this.id, pw);
			String sql = "SELECT ID,NAME,MAKER,PRICE FROM PRODUCT WHERE ID=?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id);
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto = new ProductDTO(rs.getString(1), rs.getString(2), rs.getString("maker"), rs.getInt("price"));
			}
		} finally {
			closeAll(rs, pstm, con);
		}
		return dto;
	}

	/*
	 * SELECT ALL COUNT
	 */
	public int getTotalCount() throws SQLException {
		int total = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, this.id, pw);
			String sql = "SELECT COUNT(*) FROM PRODUCT";
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				total = rs.getInt(1);
			}
		} finally {
			closeAll(rs, pstm, con);
		}
		return total;
	}

	// count 함수는 무조건 한 row행을 반환하므로 next()를 실행
	public boolean isExistProduct(String id2) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		boolean check = false;
		try {
			con = DriverManager.getConnection(dbUrl, this.id, pw);
			String sql = "SELECT COUNT(*) FROM PRODUCT WHERE ID=?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id2);
			rs = pstm.executeQuery();
			while (rs.next()) {
				check = (rs.getInt(1) == 1 ? true : false);
			}
		} finally {
			closeAll(rs, pstm, con);
		}
		return check;
	}

	/**
	 * INSERT
	 * 
	 * @param productDTO
	 * @throws SQLException
	 */
	public void registerProduct(ProductDTO productDTO) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = DriverManager.getConnection(dbUrl, this.id, pw);
			String sql = "INSERT INTO PRODUCT(ID,NAME,MAKER,PRICE)VALUES(?,?,?,?)";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, productDTO.getId());
			pstm.setString(2, productDTO.getName());
			pstm.setString(3, productDTO.getMaker());
			pstm.setInt(4, productDTO.getPrice());
			int result = pstm.executeUpdate();
			System.out.println("전송한 row : " + result);
		} finally {
			closeAll(pstm, con);
		}
	}

	public ArrayList<ProductDTO> getProductListByPriceOrderByDesc(int lowPrice, int hiPrice) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		try {
			con = DriverManager.getConnection(dbUrl, this.id, pw);
			String sql = "SELECT NAME,PRICE FROM PRODUCT WHERE PRICE BETWEEN ? AND ? ORDER BY PRICE DESC ";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, lowPrice);
			pstm.setInt(2, hiPrice);
			rs = pstm.executeQuery();
			while (rs.next()) {
				list.add(new ProductDTO(rs.getString(1), rs.getInt(2)));
			}
		} finally {
			closeAll(rs, pstm, con);
		}
		return list;
	}

	public ArrayList<ProductDTO> getProductListDiscountPrice(int percent) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		try {
			con = DriverManager.getConnection(dbUrl, this.id, pw);
			String sql = "SELECT NAME,PRICE-(PRICE*?/100) as 할인가 FROM PRODUCT ORDER BY PRICE ASC";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, percent);
			rs = pstm.executeQuery();
			while (rs.next()) {
				list.add(new ProductDTO(rs.getString(1), rs.getInt(2)));
			}
		} finally {
			closeAll(rs, pstm, con);
		}
		return list;
	}

}
