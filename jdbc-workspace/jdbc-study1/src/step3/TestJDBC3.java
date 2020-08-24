package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *  INSERT SQL�� �̿��� MEMBER TABLE�� ȸ�� ������ ����
 */
public class TestJDBC3 {

	public static void main(String[] args) {

		String drive ="oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			//1. DB ������ ���� Driver loading
			Class.forName(drive);
			//2. Connection DB����
			Connection con = DriverManager.getConnection(dbUrl,"scott","tiger");
			System.out.println(con);
			String sql="INSERT INTO member(ID,PASSWORD,NAME,ADDRESS)VALUES(?,?,?,?)";
			//3. SQL���� , PreparedStatement �̿��� SQL����
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "CEO2"); // ID ? �� �Ҵ� 1�� ù���� ����ǥ�� �ǹ�
			ps.setString(2, "OEC");
			ps.setString(3, "������ ����");
			ps.setString(4, "�Ǳ�");
			//setNString �� �ٱ��� ������ --> DB NVARCHAR2 ���
			
			//INSERT , DELETE , UPDATE �ÿ��� executeUpdate()�� ����ϰ� 
			//SELECT �ÿ��� ����� ��ȯ�ޱ� ���� executeQuery()�� �̿��� ResultSet�� ��ȯ�޴´�.
			int result = ps.executeUpdate(); // ������ �� row �� (�Է� �� �� ��)
			
			System.out.println("insert ok!! row : "+result);
			if(ps != null)
			ps.close();
			if(con != null)
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
