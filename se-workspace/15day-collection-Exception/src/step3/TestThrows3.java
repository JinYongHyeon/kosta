package step3;

class InformationException extends Exception{
	public InformationException(String message) {
		super(message);
	}
}

class MemberDAO{
	public void registerInfo(String info) throws InformationException{
		if(info == null) {
			throw new InformationException("null�� �����ͺ��̽��� �Է��Ͻ� �� �����ϴ�.");
		}else if(info.equals("")) {
			throw new InformationException("������ �����ͺ��̽��� �Է��Ͻ� �� �����ϴ�.");
		}
		
		
		System.out.println(info+" database�� insert");
	}
}

public class TestThrows3 {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		try {
		dao.registerInfo("asd");
		}catch(InformationException e) {
			System.out.println(e.getMessage());
		}
	}

}
