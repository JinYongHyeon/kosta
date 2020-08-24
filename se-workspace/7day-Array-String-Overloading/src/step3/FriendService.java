package step3;

public class FriendService {
	/*
	 * 25세 이상만 출력
	 */
	public void findNamesByAgs(FriendVO[] f, int age) {
		for (int i = 0; i < f.length; i++) {
			if (age <= f[i].getAge()) {
				System.out.println("이름 : " + f[i].getName() + " " + f[i].getAge() + "살");
			}
		}
	}
	/*
	 * 주소 분당 출력
	 */
	public void findNickAddress(FriendVO[] f, String address) {
		for (int i = 0; i < f.length; i++) {
			if(address.equals(f[i].getAddress())) {
				System.out.println("이름 : " + f[i].getName() + " 주소  : " + f[i].getAddress());
			}
		}

	}
	/*
	 * 이름(성)이 정으로 시작하는 사람 출력
	 */
	public void findNameByFirstName(FriendVO[] f, String firstName) {
		for (int i = 0; i < f.length; i++) {
			if(f[i].getName().startsWith(firstName)){
				System.out.println(f[i].getName());
			}
		}
	}

}
