package service;

import java.util.Iterator;
import java.util.LinkedHashMap;

import model.Person;

public class SchoolService {
	private LinkedHashMap<String, Person> map = new LinkedHashMap<String, Person>();

	/**
	 * 사원 추가
	 * 
	 * @param person
	 */
	public void addPerson(Person person) {
		// String key = findIndexByTel(person.getTel());
		if (!map.containsKey(person.getTel())) {
			map.put(person.getTel(), person);
		} else {
			System.out.println(person.getTel() + "전화번호가 이미 존재합니다.");
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
	 * 전화번호 중복검사
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
	 * 전화번호 사람 검색
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
			System.out.println(map.get(person.getTel()).getName() + "님이 수정되었습니다.");
		} else {
			System.out.println("전화번호가 존재하지 않습니다. 수정할수없습니다.");
		}
	}

}
