package test;

import java.sql.SQLException;

import model.MovieDAO;
import model.MovieVO;

public class TestMovieDAO {

	public static void main(String[] args) {
		try {
			MovieDAO dao = new MovieDAO();
			MovieVO vo = new MovieVO();
			vo.setTitle("인터스텔라");
			vo.setAttendacne(100);
			dao.register(vo);
			System.out.println("영화정보등록 OK"); //발급된 id까지 모두 출력
			System.out.println(vo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
