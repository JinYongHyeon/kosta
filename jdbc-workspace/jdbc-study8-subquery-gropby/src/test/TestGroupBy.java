package test;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

import model.EmployeeDAO;

public class TestGroupBy {

	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			/*
			 * JOB그룹별  최고 SALARY를 조회 , HIGHSALARY 내림차순
			 * (JOB , HIGHSALARY)
			 */
			ArrayList<LinkedHashMap<String , Object>> list = dao.getJobGroupInfoGroupbyJob();
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).get("job") + "     "+list.get(i).get("highsal"));
			}
			Iterator iterator = list.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}catch(Exception e) {
			e.printStackTrace(); //에러 원인과 경로를 출력
		}
	}

}
