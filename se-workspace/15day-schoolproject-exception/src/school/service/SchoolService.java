package school.service;

import java.util.Iterator;
import java.util.LinkedHashMap;

import model.exception.DuplicateTelException;
import model.exception.PersonNotFoundException;
import school.model.Person;

public class SchoolService {
	private LinkedHashMap<String, Person> map = new LinkedHashMap<String, Person>();

	/**
	 * 사원 추가
	 * 
	 * @param person
	 */
	public void addPerson(Person person) throws DuplicateTelException {
		// String key = findIndexByTel(person.getTel());
		if (!map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
		} else {
			throw new DuplicateTelException(person.getTel()+" tel이 존재하여 추가불가!");
			
		}

	}

	/**
	 * 사원 전체 출력
	 */
	public void printAll() {
		Iterator<Person> it = map.values().iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	/**
	 * 전화번호 사람 검색
	 * 
	 * @param string
	 * @return
	 */
	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		Person p = map.get(tel);
		if(p == null) throw new PersonNotFoundException(tel + " tel이 존재하지 않아 조회할 수 없습니다.");
		return p;
	}

	public Person removePersonByTel(String tel)throws PersonNotFoundException {
		Person p = map.get(tel);
		if(p==null) throw new PersonNotFoundException(tel + " tel이 존재하지 않아 삭제할 수 없습니다.!");
		return p;
	}

	public void updatePerson(Person person)throws PersonNotFoundException  {
		if (map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
			System.out.println(map.get(person.getTel()).getName() + "님이 수정되었습니다.");
		} else {
			throw new PersonNotFoundException("전화번호가 존재하지 않습니다. 수정할수없습니다.");
		}
	}

}
