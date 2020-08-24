package bank.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bank.exception.BankBlanceException;
import bank.exception.BankNoException;
import bank.exception.BankPassWordException;
import bank.model.BankVO;

public class BankDAO {
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String id = "scott";
	String pw = "tiger";

	public BankDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	/**
	 * ����üũ / �ܾ� ��ȸ
	 * 
	 * @param banNo
	 * @param password
	 * @return
	 * @throws SQLException
	 * @throws BankNoException
	 * @throws BankPassWordException 
	 */
	public BankVO bankSelectCheck(int banNo, String password) throws SQLException, BankNoException, BankPassWordException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BankVO bankVO = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "SELECT BANK_NO,NAME,PASSWORD,BLANCE FROM BANK WHERE BANK_NO=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, banNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if(rs.getString("password").equals(password)){
				bankVO = new BankVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				}else {
					throw new BankPassWordException("��й�ȣ�� �ùٸ��� �ʽ��ϴ�");
				}
				
			} else {
			
				throw new BankNoException("���¹�ȣ�� �������� �ʽ��ϴ�.");
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return bankVO;

	}

	/**
	 * ��ݹ��� ��� ��ȸ ����üũ
	 * 
	 * @param banNo
	 * @return
	 * @throws SQLException
	 */
	public void bankSelectCheck(int bankNo) throws SQLException, BankNoException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "SELECT COUNT(*) FROM BANK WHERE BANK_NO = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bankNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getInt(1) == 0)
					throw new BankNoException(bankNo + "�� �������� �ʽ��ϴ�.");
			}
		} finally {
			closeAll(rs, pstmt, con);
		}

	}

	/**
	 * ���°���
	 * 
	 * @param vo
	 * @throws BankBlanceException
	 * @throws SQLException
	 */
	public void insert(BankVO vo) throws BankBlanceException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			if (vo.getBlance() < 1000)
				throw new BankBlanceException("�ʱ� �Ա� �ݾ��� �����մϴ� 1000�� �̻� �Աݺ�Ź�帳�ϴ�.");
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "INSERT INTO BANK(BANK_NO,NAME,PASSWORD,BLANCE) VALUES(bank_seq.nextval,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setInt(3, vo.getBlance());
			int result = pstmt.executeUpdate();
			System.out.println("row : " + result);
		} finally {
			closeAll(pstmt, con);
		}
	}

	/**
	 * �Ա�
	 * 
	 * @param bankNo
	 * @param password
	 * @param blance
	 * @throws SQLException
	 */
	public void bankBlanceUpdatePlus(int bankNo, String password, int blance) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "UPDATE BANK SET BLANCE = BLANCE+? WHERE BANK_NO=? AND PASSWORD = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, blance);
			pstmt.setInt(2, bankNo);
			pstmt.setString(3, password);
			int result = pstmt.executeUpdate();
			System.out.println("�Ա� row" + result);
		} finally {
			closeAll(pstmt, con);
		}

	}

	/**
	 * ������ü + �޴»��
	 * 
	 * @param i
	 * @param j
	 * @throws SQLException
	 */
	public void bankBlanceUpdatePlus(int bankNo, int blance) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "UPDATE BANK SET BLANCE = BLANCE+? WHERE BANK_NO=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, blance);
			pstmt.setInt(2, bankNo);
			int result = pstmt.executeUpdate();
			System.out.println("�Ա� row" + result);
		} finally {
			closeAll(pstmt, con);
		}
	}

	/**
	 * ��� / ���� ��ü -
	 * 
	 * @param bankNo
	 * @param password
	 * @param blance
	 * @throws SQLException
	 */
	public void bankBlanceUpdateMinus(int bankNo, String password, int blance) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql = "UPDATE BANK SET BLANCE = BLANCE-? WHERE BANK_NO=? AND PASSWORD = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, blance);
			pstmt.setInt(2, bankNo);
			pstmt.setString(3, password);
			int result = pstmt.executeUpdate();
			System.out.println("��� row" + result);
		} finally {
			closeAll(pstmt, con);
		}
	}

	public void bankBlanceTransfer(int bankNo, int bankNo2, String password, int blance) throws SQLException {

		bankBlanceUpdateMinus(bankNo, password, blance);
		bankBlanceUpdatePlus(bankNo2, blance);
	}
	
	
	public void bankBlanceUpdateMinus3(int bankNo, int bankNo2, String password, int blance) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(dbUrl, id, pw);
			String sql ="SELECT * FROM BANK WHERE BANO_NO = ?"; //���� �н����� -> ������ ���� -> �۱��� �ܾ� ���̳ʽ� -> �޴»������ �ܾ� �÷���
			String sql2 = "UPDATE BANK SET BLANCE = BLANCE-? WHERE BANK_NO=? AND PASSWORD = ?";
			String sql3 = "UPDATE BANK SET BLANCE = BLANCE+? WHERE BANK_NO=? AND PASSWORD = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, blance);
			pstmt.setInt(2, bankNo);
			pstmt.setString(3, password);
			int result = pstmt.executeUpdate();
			System.out.println("��� row" + result);
		} finally {
			closeAll(pstmt, con);
		}
	}
	

}
