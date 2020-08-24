package bank.cnotroller;

import java.sql.SQLException;
import java.util.Scanner;

import bank.exception.BankBlanceException;
import bank.exception.BankNoException;
import bank.exception.BankPassWordException;
import bank.model.BankVO;
import bank.service.BankDAO;

public class BankController {
	private BankDAO dao = new BankDAO();
	private Scanner sc = new Scanner(System.in);

	public void execute() {

		exit: while (true) {
			System.out.println("1.계좌 생성  2.입금  3.출금  4.잔액조회  5.계좌 이체   6. 종료");
			String message = sc.nextLine();
			switch (message) {
			case "1":
				bankInsert();
				break;
			case "2":
				bankBlanceUpdatePlus();
				break;
			case "3":
				bankBlanceUpdateMinus();
				break;
			case "4":
				bankSelect();
				break;
			case "5":
				bankBlanceUpdateMinus2();
				break;
			case "6":
				System.out.println("뱅크 시스템을 종료하겠습니다.");
				sc.close();
				break exit;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다.");
				break;
			}

		}

	}

	/**
	 * 계좌 생성
	 */
	public void bankInsert() {
		try {
			String name = null;

			while (true) {
				System.out.println("이름을 입력하세요");
				name = sc.nextLine();
				if (name.equals("null") || name == null || name.trim().equals("")) {
					System.out.println("이름을 입력해주세요 ");
				} else {
					break;
				}
			}
			String password = null;
			while (true) {
				System.out.println("비밀번호를 입력하세요");
				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("패스워드를 입력해주세요 ");
				} else {
					break;
				}
			}
			System.out.println("초기 금액 1000원 이상을 입력해주세요");
			int blance = 0;
			while (true) {
				blance = sc.nextInt();
				System.out.println(blance);
				if (blance <= 0) {
					System.out.println("금액을 다시 입력해주세요");
				} else {
					break;
				}
			}
			dao.insert(new BankVO(name, password, blance));
		} catch (BankBlanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 잔액 확인
	 */
	public void bankSelect() {
		try {
			System.out.println("잔액 조회할 계좌를 입력해주세요");
			int bankNo = Integer.parseInt(sc.nextLine());
			String password = null;
			while (true) {

				System.out.println("비밀번호를 입력하세요");

				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("패스워드를 입력해주세요 ");
				} else {
					break;
				}
			}
		
			BankVO vo = dao.bankSelectCheck(bankNo, password);
			System.out.println("계좌 주 : " + vo.getName() + "/ 잔액 : " + vo.getBlance());
		} catch (SQLException | BankNoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BankPassWordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 입금
	 */
	public void bankBlanceUpdatePlus() {

		try {
			System.out.println("입금 계좌번호를 입력해주세요");
			int bankNo = Integer.parseInt(sc.nextLine());
			String password = null;
			while (true) {

				System.out.println("입금 비밀번호를 입력하세요");
				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("패스워드를 입력해주세요 ");
				} else {
					break;
				}
			}
			System.out.println("입금 금액을 입력해주세요");
			int blance = sc.nextInt();
			dao.bankSelectCheck(bankNo, password);
			dao.bankBlanceUpdatePlus(bankNo, password, blance);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (BankNoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (BankPassWordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 출금
	 */
	public void bankBlanceUpdateMinus() {
		String password = null;
		try {
			System.out.println("출금할 계좌를 입력해주세요");
			int bankNo = Integer.parseInt(sc.nextLine());
			while (true) {
				System.out.println("비밀번호를 입력하세요");
				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("패스워드를 입력해주세요 ");
				} else {
					break;
				}
			}
			BankVO vo = dao.bankSelectCheck(bankNo, password);
			System.out.println("출금할 금액을 입력해주세요");
			int blance = Integer.parseInt(sc.nextLine());
			if (vo.getBlance() < blance)
				throw new BankBlanceException("잔액이 부족합니다.");
			dao.bankBlanceUpdateMinus(bankNo, password, blance);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (BankNoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (BankBlanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (BankPassWordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 계촤이체
	 */
	public void bankBlanceUpdateMinus2() {

		try {
			System.out.println("계좌번호를 입력해주세요");
			int bankNo = Integer.parseInt(sc.nextLine());
			String password = null;
			while (true) {
				System.out.println("비밀번호를 입력하세요");
				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("패스워드를 입력해주세요 ");
				} else {
					break;
				}
			}
			BankVO vo = dao.bankSelectCheck(bankNo, password);

			System.out.println("이체할 계좌번호를 입력해주세요;");
			int bankNo2 = Integer.parseInt(sc.nextLine());
			dao.bankSelectCheck(bankNo2);
			System.out.println("이체할 금액을 입력해주세요");
			int blance = Integer.parseInt(sc.nextLine());
			if (vo.getBlance() < blance)
				throw new BankBlanceException("잔액이 부족합니다.");
			dao.bankBlanceTransfer(bankNo, bankNo2, password, blance);
			// dao.selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BankNoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (BankBlanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (BankPassWordException e) {
			e.printStackTrace();
		}
	}

}
