package service;

import java.util.ArrayList;

import model.Info;

public class SchoolService {
	private ArrayList<Info> scList = new ArrayList<Info>();

	/***
	 * ������ ���
	 * 
	 * @param sh
	 */
	public void insert(Info sh) {
		for (int i = 0; i < scList.size(); i++) {
			if (scList.get(i).getTel().equals(sh.getTel())) {
				System.out.println("��ȭ��ȣ�� �̹� �����մϴ�.");
				return;

			}
		}

	}

	/**
	 * ������ ��� ���
	 */
	public void selectAll() {
		for (int i = 0; i < scList.size(); i++) {
			System.out.println(scList.get(i));
		}

	}

	/***
	 * ������ �˻�
	 * 
	 * @param tel
	 * @return
	 */
	public Info select(String tel) {
		for (int i = 0; i < scList.size(); i++) {
			if (tel.equals(scList.get(i).getTel())) {
				return scList.get(i);
			}
		}
		return null;
	}

	/***
	 * ������ ����
	 * 
	 * @param tel
	 */
	public Info delete(String tel) {
		Info is = null;
		for (int i = 0; i < scList.size(); i++) {
			if (scList.get(i).getTel().equals(tel)) {
				scList.remove(i);
				is = scList.get(i);
				return is;
			}
		}

		if (is == null)
			System.out.println("�������� �������� �ʽ��ϴ�.");

		return null;
	}
}
