package step3;

class InformationException extends Exception{
	public InformationException(String message) {
		super(message);
	}
}

class MemberDAO{
	public void registerInfo(String info) throws InformationException{
		if(info == null) {
			throw new InformationException("null은 데이터베이스에 입력하실 수 없습니다.");
		}else if(info.equals("")) {
			throw new InformationException("공란은 데이터베이스에 입력하실 수 없습니다.");
		}
		
		
		System.out.println(info+" database에 insert");
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
