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
	 * ���� ����� ��Ʈ�ѷ����� �ε�����Ʈ ���� -> ������ ���� �� ��� ���� �о���� LinkedHashMap���ٰ� map�Ҵ� ������ ��������
	 * ������� �ƹ��� ����..
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
	 * Scanner�� ���Ḧ �� ��� Controller Class���� finally�κп� saveList�޼ҵ� ȣ��
	 * FileOutputStream���� ������ ������ �ϰ� ObjectOutputStream���� ����ȭ �۾� �� writeObject��� ->
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
	 * ���� �Է�
	 * 
	 * �Ű����� ������ �ް� LinkedHashMap���ٰ� �߰�
	 * 
	 * @param person
	 * @throws FileNotFoundException
	 * @throws DuplicateTelException
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public void insert(Person person) throws FileNotFoundException, IOException {
		map.put(person.getTel(), person);
		System.out.println("����Ʈ �߰� : " + person);

	}

	/**
	 * ��ΰ˻� : LinkedHashMap�� �ִ� ������ ��� ������� ȸ�������� �������� ���� Consoleâ�� ���
	 */
	public void selectAll() {

		Iterator<Person> it = map.values().iterator();
		if (!it.hasNext())
			System.out.println("ȸ�������� �������� �ʽ��ϴ�.");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * ��ȭ��ȣ �����˻� LinkedHashMap�� ���� �����ϴ� Ű����, ������ ���� ��ȭ��ȣ(tel) ������ �� �� �������� �������
	 * ���ܹ߻�(��ȭ��ȣ�� �������� ����) throws ȣ�� �� �޼ҵ�� ����ó��
	 * 
	 * ���� �� ��� LinkedHashMap���� �޾ƿ� ��ȭ��ȣ(key�� == tel)�� �̿��ؼ� ã�� �� ȣ�� �� �޼ҵ忡�� ��������(ã��
	 * ����)
	 * 
	 * @param tel
	 * @throws PersonNotFoundException
	 */
	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		if (!map.containsKey(tel)) {
			throw new PersonNotFoundException("��ȭ��ȣ�� �������� �ʽ��ϴ�.");
		}
		return map.get(tel);
	}

	/**
	 * ����
	 * 
	 * LinkedHashMap�� ���� �����ϴ� Ű����, ������ ���� ��ȭ��ȣ(tel) ������ �� �� �������� ������� ���ܹ߻�(��ȭ��ȣ��
	 * �������� ����)
	 * 
	 * ���� �� ��� LinkedHashMap���� �޾ƿ� ��ȭ��ȣ(key�� == tel)�� �̿��ؼ� ã�� �� ȣ�� �� �޼ҵ忡�� ��������(���� ��
	 * ����)
	 * 
	 * @param tel
	 * @throws IOException
	 * @throws PersonNotFoundException
	 */
	public Person delete(String tel) throws IOException, PersonNotFoundException {
		if (!map.containsKey(tel))
			throw new PersonNotFoundException(tel + "�� �������� �ʽ��ϴ�.");
		return map.remove(tel);

	}

	/**
	 * ���� LinkedHashMap�� ���� �����ϴ� Ű����, ������ ���� ��ȭ��ȣ(tel) ������ �� �� �������� ������� ���ܹ߻�(��ȭ��ȣ��
	 * �������� ����)
	 * 
	 * map.put("������ Ű��(tel),instace virable(��ü==person))�� ���� ������ ���� ���
	 * 
	 * @param person
	 * @throws PersonNotFoundException
	 */
	public void update(Person person) throws PersonNotFoundException {
		if (!map.containsKey(person.getTel()))
			throw new PersonNotFoundException(person.getTel() + "�� �������� �ʽ��ϴ�.");
		map.put(person.getTel(), person);
		System.out.println("���� ������ : " + person);
	}

}
