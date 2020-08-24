package step3;

import java.text.DecimalFormat;

public class CompanyService {

	public void printDetailInfo(Employee e) {
		
		/*
		 *  instanceof가 필요가 없는 이유 참초타입이 부모여도 객체 생성 자손이기 떄문에  자손 클래스에 toString 재정의를 하면 메서드는 자손 메서드 오버라이딩 사용을 해서 나옴 ㅅㄱ!
		 */
		System.out.println(e);
		
		/*if (e instanceof Engineer) {
			Engineer enginer = (Engineer) e;
			System.out.println("이름 : " + enginer.getName() + " , 금액 : " + enginer.getSalary() + ", 스킬 : "
				+ enginer.getSkill() + ", 보너스 : " + enginer.getBonus());
		} else if (e instanceof Manager) {
			Manager m = (Manager) e;
			System.out.println("이름 : " + m.getName() + " , 금액 : " + m.getSalary() + ", 스킬 : " + m.getDepartment());
			} else {
		System.out.println("이름 : " + e.getName() + " 금액 : " + e.getSalary());
		}*/

	}

	public void printAnnualSalary(Employee e) {
		int salarySum = e.getSalary();
		DecimalFormat df = new DecimalFormat("###,###"	);
		/*
		if (e instanceof Engineer) {
			salarySum = e.getSalary() + ((Engineer) e).getBonus() *12;
			System.out.println("연봉 : "+df.format(salarySum)+"만원");
 		}else {
 			salarySum = e.getSalary()*12;
 			System.out.println("연봉 : "+df.format(salarySum)+"만원");
		}*/
		if(e instanceof Engineer) {
			salarySum += ((Engineer) e).getBonus();
		}
		System.out.println(df.format(salarySum*12)+"만원");
	}
}
