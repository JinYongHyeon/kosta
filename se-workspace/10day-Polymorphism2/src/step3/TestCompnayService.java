package step3;

public class TestCompnayService {

	public static void main(String[] args) {

		
		CompanyService service = new CompanyService();
		
		/*������ ����ؼ� ����ϴ� �޼ҵ� (salary * 12) ��  �����Ͼ� salary bonus * 12 */
		service.printAnnualSalary(new Employee("�տ���", 1000));
		service.printAnnualSalary(new Engineer("������", 9000,"java",5000));
		service.printAnnualSalary(new Manager("ȫ�浿", 1000,"���ߺ�"));
		/*
		service.printDetailInfo(new Employee("�տ���", 1000));
		service.printDetailInfo(new Engineer("������", 9000,"java",5000));
		service.printDetailInfo(new Manager("ȫ�浿", 1000,"���ߺ�"));
		*/
	}

}
