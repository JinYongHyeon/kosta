package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *  INSERT SQL을 이용해 MEMBER TABLE에 회원 정보를 저장
 */
public class TestJDBC3 {

	public static void main(String[] args) {

		String drive ="oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			//1. DB 연동을 위한 Driver loading
			Class.forName(drive);
			//2. Connection DB연도
			Connection con = DriverManager.getConnection(dbUrl,"scott","tiger");
			System.out.println(con);
			String sql="INSERT INTO member(ID,PASSWORD,NAME,ADDRESS)VALUES(?,?,?,?)";
			//3. SQL정의 , PreparedStatement 이용해 SQL실행
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "CEO2"); // ID ? 에 할당 1은 첫번쨰 물음표를 의미
			ps.setString(2, "OEC");
			ps.setString(3, "진용현 사장");
			ps.setString(4, "판교");
			//setNString 은 다국어 지원임 --> DB NVARCHAR2 요거
			
			//INSERT , DELETE , UPDATE 시에는 executeUpdate()를 사용하고 
			//SELECT 시에는 결과를 반환받기 위해 executeQuery()를 이용해 ResultSet을 반환받는다.
			int result = ps.executeUpdate(); // 영향을 준 row 수 (입력 된 값 수)
			
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
