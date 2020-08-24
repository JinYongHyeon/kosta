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
		System.out.println("�ҷ�����?");
		for (int i = 0; i < index; i++) {
			//if(ep[i]== null)System.out.println("111");;
			System.out.println(ep[i]);
			
		}
	}

	/**
	 * ���޵� ������̵� ��ġ�Ǵ� �����ü(�����Ͼ�,�Ŵ��� ����)�� ȣ���� ������ ��ȯ�ϴ� �޼ҵ� ���� ������̵� ��ġ�ϴ� �����ü�� �迭��
	 * �������� �ʴ� �ٸ� null�� ��ȯ
	 * 
	 * @param empId
	 * @return Employee
	 */
	public Employee findById(String empId) {
		for (int i = 0; i < index; i++) {
			if (empId.equals(ep[i].getEmpId())) {
				employee = ep[i];
				break; // ���๮�� �����.
			}
		}
		return employee;
	}

	/**
	 * ���޵� ������̵� ��ġ�Ǵ� �����ü(�����Ͼ�,�Ŵ��� ����)�� �����ϴ� �޼ҵ�
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
		if(point == -1)System.out.println("empId�� �������� �ʽ��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public int findIndexByEmpId(String empId) {
		int point = -1;
		for (int i = 0; i < index; i++) {
			if (empId.equals(ep[i].getEmpId())) {
				point =i;
				break; // ���๮�� �����.
			}
		}
		return point;
	}
	/**
	 * �Ű������� ���޵� ������̵�� �迭����� �����ü�� ������̵� ��ġ�ϸ� �ش� �迭��Ҹ� �����ϴ� �޼���
	 * @param empId
	 * 1.findIndexByEmpId()�޼��带 �̿��� ������̵� �ش��ϴ� �迭����� ��ġ�� ��ȯ�޴´�. ������ġ�ϴ� ����� ������ -1 ��ȯ�Ѵ�.
	 * 2. -1 ��ȯ�Ǹ� ��ġ�ϴ� ����� �����ϴ� ��� �޼��带 ����ϰ� �۾�����
	 * 3. -1 �� �ƴϸ� ��ġ�ϴ� ����� ������ �ش� ����� ��ġ�� ���� �̿��� �� �������� index(�����)���� ���� ���� ��� �ݺ��ϸ鼭 �� ��Ҹ� �տ�ҿ� �Ҵ��ϴ� ������� �����Ѵ�.
	 * 3.1 ���� ������Ұ� ������ ��Ҷ��(array[i] = array[1+1] -> �Ұ��� ���� null�� �Ҵ��Ѵ�.
	 */
	public void removeById(String empId) {
		int poistion = findIndexByEmpId(empId);
		if(poistion == -1) {
			System.out.println(empId+"������̵� �ش��ϴ� ����� ��� �����Ұ�");
		}else {//���� ����� �迭�� ������ �����Ѵ�.
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
