package model;

import service.SchoolService;

/*
 * ����Ͻ� ������ ����ϴ� SchoolService�� ���� �׽�Ʈ�ϴ� Ŭ����
 */
public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		System.out.println("****������ ���� �߰� ����****");
		  service.addPerson(new Student("0101231234","������","����","17"));
		  service.addPerson(new Teacher("0101231235","�ż�ȣ","����","����"));
		  service.addPerson(new Student("0101231236","������","����","16"));
		  service.addPerson(new Employee("0101231237","�ۿ���","ȭ��","�繫��"));
		  service.addPerson(new Student("0101231238","������","����","18"));
		  service.addPerson(new Teacher("0101231239","����","����","����"));
		  service.addPerson(new Teacher("0101231239","����2","����","����"));
		  
		System.out.println("****������ ���� �߰� �Ϸ�****");
		service.printAll();
		System.out.println("****������ ��ü ���****");
		System.out.println(service.findIndexByTel("0101231236"));
		System.out.println(service.findIndexByTel("1231231231231"));
		System.out.println("****���� �׽�Ʈ****");
		Person p = service.removePersonByTel("0101231236");
		System.out.println(p);
		  service.addPerson(new Student("0101231234","������","����","17"));
		service.printAll();
		
	}
}
