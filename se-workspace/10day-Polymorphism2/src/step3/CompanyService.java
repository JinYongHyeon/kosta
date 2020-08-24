package step3;

import java.text.DecimalFormat;

public class CompanyService {

	public void printDetailInfo(Employee e) {
		
		/*
		 *  instanceof�� �ʿ䰡 ���� ���� ����Ÿ���� �θ𿩵� ��ü ���� �ڼ��̱� ������  �ڼ� Ŭ������ toString �����Ǹ� �ϸ� �޼���� �ڼ� �޼��� �������̵� ����� �ؼ� ���� ����!
		 */
		System.out.println(e);
		
		/*if (e instanceof Engineer) {
			Engineer enginer = (Engineer) e;
			System.out.println("�̸� : " + enginer.getName() + " , �ݾ� : " + enginer.getSalary() + ", ��ų : "
				+ enginer.getSkill() + ", ���ʽ� : " + enginer.getBonus());
		} else if (e instanceof Manager) {
			Manager m = (Manager) e;
			System.out.println("�̸� : " + m.getName() + " , �ݾ� : " + m.getSalary() + ", ��ų : " + m.getDepartment());
			} else {
		System.out.println("�̸� : " + e.getName() + " �ݾ� : " + e.getSalary());
		}*/

	}

	public void printAnnualSalary(Employee e) {
		int salarySum = e.getSalary();
		DecimalFormat df = new DecimalFormat("###,###"	);
		/*
		if (e instanceof Engineer) {
			salarySum = e.getSalary() + ((Engineer) e).getBonus() *12;
			System.out.println("���� : "+df.format(salarySum)+"����");
 		}else {
 			salarySum = e.getSalary()*12;
 			System.out.println("���� : "+df.format(salarySum)+"����");
		}*/
		if(e instanceof Engineer) {
			salarySum += ((Engineer) e).getBonus();
		}
		System.out.println(df.format(salarySum*12)+"����");
	}
}
