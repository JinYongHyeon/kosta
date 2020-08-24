package step5;

import java.util.ArrayList;

class Friend {
	private String name;
	private String address;
	private int money;

	public Friend(String name, String address, int money) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getM() {
		return money;
	}

	public void setM(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "name=" + name + ", address=" + address + ", money=" + money ;
	}
	
}

public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		list.add(new Friend("블리츠크랭크", "데마시아", 500));
		list.add(new Friend("포로", "소환사협곡", 5100));
		list.add(new Friend("티모", "데마시아", 400));
		list.add(new Friend("티모2", "데마시아", 400));
		
		ArrayList<Friend> list2 = new ArrayList<Friend>();
		list2.add(new Friend("블리츠크랭크", "데마시아", 500));
		list2.add(new Friend("포로", "소환사협곡", 5100));
		list2.add(new Friend("티모", "데마시아", 400));
		list2.add(new Friend("티모2", "데마시아", 400));
		
		System.out.println(list);
		
		//list 의 요소 객체 중 address가 춘천인 친구의 이름을 모두 출력
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getAddress().equals("데마시아")) {
				System.out.println(list.get(i).getName());
			}
		}
		//리스트의 마지막 요소를 삭제
		Friend f = list.remove(list.size()-1);
		System.out.println("삭제한 친구 정보 : "+f);
	//	list.clear();
		//System.out.println(list);
		list.removeAll(list2);
		
		System.out.println(list);

		
		//System.out.println(list);
		
		
		System.out.println("***********************************");
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("b");
		list3.add("c");
		System.out.println(list3);
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("a");

		list4.add("c");
		
		list3.removeAll(list4);
		
		System.out.println(010101);
		
		System.out.println(list3);
		
	}
}
