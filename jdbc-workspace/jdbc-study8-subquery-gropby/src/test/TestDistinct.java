package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.EmployeeDAO;

public class TestDistinct {

	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			ArrayList<String> list = dao.getJobKind();
			/*
			 * 1.ÃÑ¹«
			 * 2.°³¹ß
			 * 3.±âÈ¹
			 */
			for(int i=0;i<list.size();i++) {
				System.out.println(i+1+"."+list.get(i));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
