package test;

import java.util.ArrayList;

import model.Person;

public class TestForLoop {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("ȫ�浿", 500));
		list.add(new Person("������", 1500));
		list.add(new Person("�տ���", 700));
		//for ����
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName()+ " , "+list.get(i).getMoney());
		}
		//for loop
		for(Person p : list) {
			System.out.println(p.getName() + " , " + p.getMoney());
		}
	}

}