package school.service;

import java.util.Iterator;
import java.util.LinkedHashMap;

import model.exception.DuplicateTelException;
import model.exception.PersonNotFoundException;
import school.model.Person;

public class SchoolService {
	private LinkedHashMap<String, Person> map = new LinkedHashMap<String, Person>();

	/**
	 * ��� �߰�
	 * 
	 * @param person
	 */
	public void addPerson(Person person) throws DuplicateTelException {
		// String key = findIndexByTel(person.getTel());
		if (!map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
		} else {
			throw new DuplicateTelException(person.getTel()+" tel�� �����Ͽ� �߰��Ұ�!");
			
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
	 * ��ȭ��ȣ ��� �˻�
	 * 
	 * @param string
	 * @return
	 */
	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		Person p = map.get(tel);
		if(p == null) throw new PersonNotFoundException(tel + " tel�� �������� �ʾ� ��ȸ�� �� �����ϴ�.");
		return p;
	}

	public Person removePersonByTel(String tel)throws PersonNotFoundException {
		Person p = map.get(tel);
		if(p==null) throw new PersonNotFoundException(tel + " tel�� �������� �ʾ� ������ �� �����ϴ�.!");
		return p;
	}

	public void updatePerson(Person person)throws PersonNotFoundException  {
		if (map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
			System.out.println(map.get(person.getTel()).getName() + "���� �����Ǿ����ϴ�.");
		} else {
			throw new PersonNotFoundException("��ȭ��ȣ�� �������� �ʽ��ϴ�. �����Ҽ������ϴ�.");
		}
	}

}
