package test;

import java.sql.SQLException;

import model.MovieDAO;
import model.MovieVO;

public class TestMovieDAO {

	public static void main(String[] args) {
		try {
			MovieDAO dao = new MovieDAO();
			MovieVO vo = new MovieVO();
			vo.setTitle("���ͽ��ڶ�");
			vo.setAttendacne(100);
			dao.register(vo);
			System.out.println("��ȭ������� OK"); //�߱޵� id���� ��� ���
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
