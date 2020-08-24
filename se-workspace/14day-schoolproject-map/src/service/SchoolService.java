package service;

import java.util.Iterator;
import java.util.LinkedHashMap;

import model.Person;

public class SchoolService {
	private LinkedHashMap<String, Person> map = new LinkedHashMap<String, Person>();

	/**
	 * ��� �߰�
	 * 
	 * @param person
	 */
	public void addPerson(Person person) {
		// String key = findIndexByTel(person.getTel());
		if (!map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
		} else {
			System.out.println(person.getTel() + "��ȭ��ȣ�� �̹� �����մϴ�.");
		}

	}

	/**
	 * ��� ��ü ���
	 */
	public void printAll() {
		Iterator<Person> it = map.values().iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	/**
	 * ��ȭ��ȣ �ߺ��˻�
	 * 
	 * @param tel
	 * @return
	 */
	public String findIndexByTel(String tel) {
		String positon = "";
		Iterator<Person> it = map.values().iterator();
		while (it.hasNext()) {
			if (it.next().getTel().equals(tel)) {
				positon = it.next().getTel();
				break;
			}
		}
		return positon;
	}

	/**
	 * ��ȭ��ȣ ��� �˻�
	 * 
	 * @param string
	 * @return
	 */
	public Person findPersonByTel(String tel) {
		//String key = findIndexByTel(tel);
		return map.get(tel);
	}

	public Person removePersonByTel(String tel) {
		// String key = findIndexByTel(tel);

		return map.remove(tel);
	}

	public void updatePerson(Person person) {
		if (map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
			System.out.println(map.get(person.getTel()).getName() + "���� �����Ǿ����ϴ�.");
		} else {
			System.out.println("��ȭ��ȣ�� �������� �ʽ��ϴ�. �����Ҽ������ϴ�.");
		}
	}

}
