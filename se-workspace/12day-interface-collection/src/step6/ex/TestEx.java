package step6.ex;

import step6.model.CompnayService;
import step6.model.Employee;
import step6.model.Engineer;
import step6.model.Manager;

public class TestEx {

	public static void main(String[] args) {

		CompnayService service = new CompnayService(100);
		
		System.out.println("*****�����Ͻ���*****");
		service.add(new Manager("17","ȫ�浿",600,"��ȹ��"));
		service.add(new Engineer("19","������",3000,"spring"));
		service.add(new Employee("20","�ں���",500));
		service.add(new Employee("21","�Ƽ���",650));
		System.out.println("*****�����ϳ�*****");
		System.out.println("*****��ü�������*****");
		service.printAll();
		System.out.println("*****������̵�� �˻�*****");
		Employee e = service.findById("23");
		System.out.println(e);
		/*
		 * empId : , name : , salary :  , department :  skill :
		 */
		System.out.println("*****������̵�� ����*****");
		service.removeById2("17");
		service.printAll();
		
		
	}

}
