package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  SELECT ��ȸ�� ������ WHERE �� �̿��� ��ȸ
 */

public class TestJDBC2 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		try {
			Class.forName(driver);
			Connection c = DriverManager.getConnection(dbUrl, "scott", "tiger");
			//sql����
			String address = "������";
			String sql = "SELECT ID,NAME FROM MEMBER WHERE ADDRESS=?";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, address); // 1�� ù���� ����ǥ�� �ǹ��Ѵ�. ? �� ���������� �Ҵ�
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				/*String id = rs.getString(1);
				String name = rs.getString(2);*/
				
				String id = rs.getString("id"); //�÷��� ����
				String name = rs.getString("name");
				System.out.println(id + " " + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
