package school.test;

import model.exception.DuplicateTelException;
import model.exception.PersonNotFoundException;
import school.model.Employee;
import school.model.Person;
import school.model.Student;
import school.model.Teacher;
import school.service.SchoolService;

/*
 * ����Ͻ� ������ ����ϴ� SchoolService�� ���� �׽�Ʈ�ϴ� Ŭ����
 */
public class TestSchoolService {
	public static void main(String[] args) {
		/*SchoolService service = new SchoolService();
		System.out.println("**������ ���� �߰� ����**");
		service.addPerson(new Student("0101231234", "������", "����", "17"));
		service.addPerson(new Teacher("0101231235", "�ż�ȣ", "����", "����"));
		service.addPerson(new Student("0101231236", "������", "����", "16"));
		service.addPerson(new Employee("0101231237", "�ۿ���", "ȭ��", "�繫��"));
		service.addPerson(new Student("0101231238", "������", "����", "18"));
		service.addPerson(new Teacher("0101231239", "����", "����", "����"));
		System.out.println("**������ ���� �߰� �Ϸ�**");
		System.out.println("**�߰��� �ߺ�Ȯ��**");
		// �����ϴ� ��ȭ��ȣ�� �������� �߰��Ƿ��� �� ��
		service.addPerson(new Student("0101231234", "������", "����", "19"));
		// ���� ���� ������ tel�� ���� �������� �߰����� ��
		// tel �� �ߺ��Ǿ� �߰��� �� �����ϴ�! �޼��� ����ϰ� �߰����� �ʴ´�
		System.out.println("**�ߺ��׽�Ʈ �� ����Ʈ Ȯ��**");
		service.printAll();
		System.out.println("**������ ��ü ���**");
		service.printAll();

		System.out.println("**tel�� �˻��޼��� �׽�Ʈ**");
		Person p = service.findPersonByTel("0101231236");
		System.out.println("�˻����:" + p);
		System.out.println("**���� �׽�Ʈ**");
		Person rp = service.removePersonByTel("0101231236");
		System.out.println("�������:" + rp);
		System.out.println("**���� �� ����Ʈ Ȯ��**");
		service.printAll();
		service.updatePerson(new Teacher("0101231237", "�ۿ���", "����", "�ڹ�"));
		System.out.println("**���� �� ����Ʈ Ȯ��**");
		service.printAll();*/
		
		   SchoolService service = new SchoolService();
		     try {
		      service.addPerson(new Student("011", "����", "�Ǳ�", "14"));
		     } catch (DuplicateTelException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      service.addPerson(new Teacher("016", "����", "����", "����"));
		     } catch (DuplicateTelException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      service.addPerson(new Employee("017", "������", "�Ǳ�", "�ѹ�"));
		     } catch (DuplicateTelException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      service.addPerson(new Teacher("016", "����", "�Ǳ�", "�ڹ�"));
		     } catch (DuplicateTelException e) {
		      System.out.println(e.getMessage());
		     }
		     service.printAll(); 
		     System.out.println("****************step1:add �Ϸ�****************");
		     try {
		      Person rp = service.findPersonByTel(null);
		      System.out.println(rp);
		     } catch (PersonNotFoundException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      Person rp = service.findPersonByTel("010");
		      System.out.println(rp);
		     } catch (PersonNotFoundException e) {
		      System.out.println(e.getMessage());
		     }
		     System.out.println("****************step2:find �Ϸ�****************");  
		     try {
		      service.removePersonByTel("016");
		      System.out.println("���� ok");
		     } catch (PersonNotFoundException e) {
		      System.out.println(e.getMessage());
		     }
		     try {
		      service.removePersonByTel("010");
		      System.out.println("���� ok");
		     } catch (PersonNotFoundException e) {
		      System.out.println(e.getMessage());
		     }
		     service.printAll();  
		     System.out.println("****************step3:delete �Ϸ�****************"); 
		     }
		 


	}

