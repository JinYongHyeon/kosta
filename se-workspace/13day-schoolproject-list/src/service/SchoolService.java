package service;

import java.util.ArrayList;

import model.Info;

public class SchoolService {
	private ArrayList<Info> scList = new ArrayList<Info>();

	/***
	 * 구성원 등록
	 * 
	 * @param sh
	 */
	public void insert(Info sh) {
		for (int i = 0; i < scList.size(); i++) {
			if (scList.get(i).getTel().equals(sh.getTel())) {
				System.out.println("전화번호가 이미 존재합니다.");
				return;

			}
		}

	}

	/**
	 * 구성원 모두 출력
	 */
	public void selectAll() {
		for (int i = 0; i < scList.size(); i++) {
			System.out.println(scList.get(i));
		}

	}

	/***
	 * 구성원 검색
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
	 * 구성원 삭제
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
			System.out.println("구성원의 존재하지 않습니다.");

		return null;
	}
}
