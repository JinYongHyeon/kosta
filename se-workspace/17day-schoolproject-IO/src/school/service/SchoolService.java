package school.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;

import model.exception.DuplicateTelException;
import model.exception.PersonNotFoundException;
import school.model.Person;

public class SchoolService {
	private LinkedHashMap<String, Person> map = new LinkedHashMap<String, Person>();
	private String path = "C:" + File.separator + "kosta203" + File.separator + "iotest" + File.separator
			+ "school.obj";

	private ObjectOutputStream oos = null;

	/**
	 * 메인 실행시 컨트롤러에서 로딩리스트 실행 -> 파일이 존재 할 경우 파일 읽어오고 LinkedHashMap에다가 map할당 파일이 존재하지
	 * 않을경우 아무일 없음..
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void loadList() throws IOException, ClassNotFoundException {

		File f = new File(path);

		File fileList[] = f.getParentFile().listFiles();
		ObjectInputStream ois = null;
		try {
			if (f.exists() && f.isFile()) {
				ois = new ObjectInputStream(new FileInputStream(path));
				map = (LinkedHashMap<String, Person>) ois.readObject();
			} else {
				f.getParentFile().mkdirs();
			}
		} finally {
			if (ois != null)
				ois.close();
		}
	}

	/**
	 * Scanner을 종료를 할 경우 Controller Class에서 finally부분에 saveList메소드 호출
	 * FileOutputStream으로 파일을 생성을 하고 ObjectOutputStream으로 직렬화 작업 후 writeObject출력 ->
	 * close();
	 * 
	 * @throws IOException
	 */
	public void saveList() throws IOException {
		try {
			oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(map);
		} finally {
			if (oos != null)
				oos.close();
		}
	}

	/**
	 * 정보 입력
	 * 
	 * 매개변수 정보를 받고 LinkedHashMap에다가 추가
	 * 
	 * @param person
	 * @throws FileNotFoundException
	 * @throws DuplicateTelException
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public void insert(Person person) throws FileNotFoundException, IOException {
		map.put(person.getTel(), person);
		System.out.println("리스트 추가 : " + person);

	}

	/**
	 * 모두검색 : LinkedHashMap에 있는 정보들 출력 없을경우 회원정보가 존재하지 않음 Console창에 출력
	 */
	public void selectAll() {

		Iterator<Person> it = map.values().iterator();
		if (!it.hasNext())
			System.out.println("회원정보가 존재하지 않습니다.");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * 전화번호 유무검사 LinkedHashMap에 현재 존재하는 키값을, 정보를 받은 전화번호(tel) 정보랑 비교 후 존재하지 않을경우
	 * 예외발생(전화번호가 존재하지 않음) throws 호출 한 메소드로 예외처리
	 * 
	 * 존재 할 경우 LinkedHashMap에서 받아온 전화번호(key값 == tel)를 이용해서 찾은 후 호출 한 메소드에게 정보전달(찾은
	 * 정보)
	 * 
	 * @param tel
	 * @throws PersonNotFoundException
	 */
	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		if (!map.containsKey(tel)) {
			throw new PersonNotFoundException("전화번호가 존재하지 않습니다.");
		}
		return map.get(tel);
	}

	/**
	 * 삭제
	 * 
	 * LinkedHashMap에 현재 존재하는 키값을, 정보를 받은 전화번호(tel) 정보랑 비교 후 존재하지 않을경우 예외발생(전화번호가
	 * 존재하지 않음)
	 * 
	 * 존재 할 경우 LinkedHashMap에서 받아온 전화번호(key값 == tel)를 이용해서 찾은 후 호출 한 메소드에게 정보전달(삭제 한
	 * 정보)
	 * 
	 * @param tel
	 * @throws IOException
	 * @throws PersonNotFoundException
	 */
	public Person delete(String tel) throws IOException, PersonNotFoundException {
		if (!map.containsKey(tel))
			throw new PersonNotFoundException(tel + "가 존재하지 않습니다.");
		return map.remove(tel);

	}

	/**
	 * 수정 LinkedHashMap에 현재 존재하는 키값을, 정보를 받은 전화번호(tel) 정보랑 비교 후 존재하지 않을경우 예외발생(전화번호가
	 * 존재하지 않음)
	 * 
	 * map.put("수정할 키값(tel),instace virable(객체==person))을 한후 수정한 내용 출력
	 * 
	 * @param person
	 * @throws PersonNotFoundException
	 */
	public void update(Person person) throws PersonNotFoundException {
		if (!map.containsKey(person.getTel()))
			throw new PersonNotFoundException(person.getTel() + "가 존재하지 않습니다.");
		map.put(person.getTel(), person);
		System.out.println("수정 데이터 : " + person);
	}

}
