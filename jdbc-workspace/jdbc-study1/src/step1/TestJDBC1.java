package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Oracle DB와 연동하는 자바 어플리케이션 테스트
 * SELECT 구문을 실행해 결과를 조회하여 출력하는 예제
 * 
 * JDBC 프로그래밍 개발 단계
 *  1.데이터베이스 연동을 위한 jdbc driver loading
 *  2.Connection
 *  3.SQL 정의 후  PreparedStatement
 *  4.SQL 정의 후  executeQuery()
 *  5.ResultSet : next(): boolean , getString() or getInt()
 *  6.close() <-- commit??
 */
public class TestJDBC1 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			// 클래스로더 라는 녀석을 통해서 해당 데이터베이스 드라이버를 로드할 뿐 데이터베이스와의 연결에 관해서는 아무런 동작도 하지 않는다고 합니다.
			Class.forName(driver);
			System.out.println("oracle driver loading ok!");
			// Connection 객체 연결 --> db 연결
			Connection con = DriverManager.getConnection(dbUrl, "scott", "tiger");
			String sql = "SELECT ID,PASSWORD,NAME,ADDRESS FROM MEMBER";
			System.out.println("connection" + con);

			PreparedStatement ps = con.prepareStatement(sql);
			// 데이터베이스에서 데이터를 가져와서 결과 집합을 반환합니다
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { // 결과행이 있을 떄까지 반복
				String id = rs.getString(1); // (1) 컬럼 index
				String password = rs.getString(2);
				String name = rs.getString(3);
				String address = rs.getString(4);
				System.out.println(id + " " + password + " " + name + " " + address);
			}
			rs.close();
			ps.close();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
