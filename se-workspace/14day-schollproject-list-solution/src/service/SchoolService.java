package service;

import java.util.ArrayList;

import model.Person;

public class SchoolService {
	private ArrayList<Person> list = new ArrayList<Person>();

	public void addPerson(Person person) { // �Ű������� �θ�Ÿ���� �����ϸ� �پ��� �ڽİ�ü�� ó�� �� �� �ִ�.
		int num = findIndexByTel(person.getTel());
		if (num == -1) {
			list.add(person);

		} else {
			System.out.println("��ȭ��ȣ�� �̹� �����մϴ�.");
		}

	}

	/***
	 * Service : �ý��� ������ ����Ͻ� ������ ���
	 */
	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	/**
	 * 
	 * @param tel
	 * @return int
	 */
	public int findIndexByTel(String tel) {
		int telNumber = -1;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTel().equals(tel))
				telNumber = i;
				break;
		}
		return telNumber;
	}

	public Person findPersonByTel(String tel) {
		Person p = null;
		int poistion =findIndexByTel(tel);
		if (poistion != -1) {
			p = list.get(poistion);
		}

		return p;
	}

	public Person removePersonByTel(String tel) {
		Person p = null;
		int position = findIndexByTel(tel);
		if(position != -1) {
			p = list.remove(position);
		}else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		return p;
	}

}
