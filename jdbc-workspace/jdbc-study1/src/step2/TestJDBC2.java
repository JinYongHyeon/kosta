package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  SELECT 조회시 조건절 WHERE 을 이용해 조회
 */

public class TestJDBC2 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		try {
			Class.forName(driver);
			Connection c = DriverManager.getConnection(dbUrl, "scott", "tiger");
			//sql정의
			String address = "워싱턴";
			String sql = "SELECT ID,NAME FROM MEMBER WHERE ADDRESS=?";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, address); // 1은 첫번쟤 물음표를 의미한다. ? 에 변수정보를 할당
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				/*String id = rs.getString(1);
				String name = rs.getString(2);*/
				
				String id = rs.getString("id"); //컬럼명 가능
				String name = rs.getString("name");
				System.out.println(id + " " + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
