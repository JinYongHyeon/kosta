package step6.model;

public class CompnayService {

	private Employee[] ep;
	private Employee employee;
	private int index;


	public CompnayService(int length) {
		ep = new Employee[length];
	}

	public void add(Employee e) {
		ep[index++] = e;
	}

	public void printAll() {
		System.out.println("불러지나?");
		for (int i = 0; i < index; i++) {
			//if(ep[i]== null)System.out.println("111");;
			System.out.println(ep[i]);
			
		}
	}

	/**
	 * 전달된 사원아이디에 일치되는 사원객체(엔지니어,매니저 포함)을 호출한 곳으로 반환하는 메소드 만약 사원아이디에 일치하는 사원객체가 배열에
	 * 존재하지 않는 다면 null을 반환
	 * 
	 * @param empId
	 * @return Employee
	 */
	public Employee findById(String empId) {
		for (int i = 0; i < index; i++) {
			if (empId.equals(ep[i].getEmpId())) {
				employee = ep[i];
				break; // 실행문을 벗어난다.
			}
		}
		return employee;
	}

	/**
	 * 전달된 사원아이디에 일치되는 사원객체(엔지니어,매니저 포함)을 삭제하는 메소드
	 * 
	 * @param empId
	 */
	public void removeById2(String empId) {
		int point=-1;
		try {
		for (int i = 0; i < index; i++) {	
			if (empId.equals(ep[i].getEmpId())) {
				point = i;
				for (int j = point; j < index; j++) {	
					if( j+1 == index){
						--index;
//						ep[j] = null;
//						return;
					}else {
						ep[j] = ep[j+1];
					}
				}
				
			}

		}
		if(point == -1)System.out.println("empId가 존재하지 않습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public int findIndexByEmpId(String empId) {
		int point = -1;
		for (int i = 0; i < index; i++) {
			if (empId.equals(ep[i].getEmpId())) {
				point =i;
				break; // 실행문을 벗어난다.
			}
		}
		return point;
	}
	/**
	 * 매개변수로 전달된 사원아이디와 배열요소의 사원객체의 사원아이디가 일치하면 해당 배열요소를 삭제하는 메서드
	 * @param empId
	 * 1.findIndexByEmpId()메서드를 이용해 사원아이디에 해당하는 배열요소의 위치를 반환받는다. 만약일치하는 사원이 없으면 -1 반환한다.
	 * 2. -1 반환되면 일치하는 사원이 없습니다 라는 메서드를 출력하고 작업종료
	 * 3. -1 이 아니면 일치하는 사원이 있으면 해당 사원이 위치한 값을 이용해 그 지점부터 index(사원수)보다 작을 동안 계속 반복하면서 뒤 요소를 앞요소에 할당하는 방식으로 삭제한다.
	 * 3.1 만약 삭제요소가 마지막 요소라면(array[i] = array[1+1] -> 불가능 직접 null을 할당한다.
	 */
	public void removeById(String empId) {
		int poistion = findIndexByEmpId(empId);
		if(poistion == -1) {
			System.out.println(empId+"사원아이디에 해당하는 사원이 없어서 삭제불가");
		}else {//삭제 대상이 배열에 있으면 삭제한다.
			for(int i=poistion; i<index;i++) {
				if(i+1 == ep.length) {
					ep[i]=null;
				}else {
				ep[i] = ep[i+1];
				}
			}
			index--;
		}
		
	}

}
