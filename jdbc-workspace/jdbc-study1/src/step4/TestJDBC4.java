package step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *  DML - DELECT , address�� �������� ȸ�������� ��� ����
 */
public class TestJDBC4 {

	public static void main(String[] args) {
		String drive = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		try {
			Class.forName(drive);
			Connection con = DriverManager.getConnection(dbUrl,"scott","tiger");
			String sql="DELETE FROM MEMBER WHERE ADDRESS=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "�Ǳ�");
			int result = ps.executeUpdate();
			System.out.println("���� �� row : "+result);
			
			if(ps != null)
				ps.close();
			if(con != null)
				con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
