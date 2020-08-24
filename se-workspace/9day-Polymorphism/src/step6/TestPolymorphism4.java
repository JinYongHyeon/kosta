package step6;

class Employee {

}

class Engineer extends Employee {

}

class Manager extends Employee {

}

class Secreatary extends Employee {

}

class CompanyService {
//�������� ����ǹǷ� ����� ������ �������� �ϳ��� �޼��忡�� ��� ó�� �� �� �ִ�.
	public void register(Employee employee) {
		//instanceof �����ڸ� �̿��� ��ü�� Ÿ���� Ȯ��
		if (employee instanceof Engineer) {
			System.out.println(employee + " ŷ���Ͼ� ��ϿϷ�");
		} else if(employee instanceof Manager) {
			System.out.println(employee + " �Ŵ��� ��ϿϷ�");
		} else if(employee instanceof Secreatary) {
			System.out.println(employee + " �� ��ϿϷ�");
		} else {
			System.out.println(employee + " �Ϲݻ���Դϴ�.");
		}
	}

}

public class TestPolymorphism4 {

	public static void main(String[] args) {
		CompanyService service = new CompanyService();
		service.register(new Employee());
		service.register(new Engineer());
		service.register(new Manager());
		service.register(new Secreatary());
	}

}
