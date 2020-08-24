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
			System.out.println("1.���� ����  2.�Ա�  3.���  4.�ܾ���ȸ  5.���� ��ü   6. ����");
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
				System.out.println("��ũ �ý����� �����ϰڽ��ϴ�.");
				sc.close();
				break exit;
			default:
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
				break;
			}

		}

	}

	/**
	 * ���� ����
	 */
	public void bankInsert() {
		try {
			String name = null;

			while (true) {
				System.out.println("�̸��� �Է��ϼ���");
				name = sc.nextLine();
				if (name.equals("null") || name == null || name.trim().equals("")) {
					System.out.println("�̸��� �Է����ּ��� ");
				} else {
					break;
				}
			}
			String password = null;
			while (true) {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("�н����带 �Է����ּ��� ");
				} else {
					break;
				}
			}
			System.out.println("�ʱ� �ݾ� 1000�� �̻��� �Է����ּ���");
			int blance = 0;
			while (true) {
				blance = sc.nextInt();
				System.out.println(blance);
				if (blance <= 0) {
					System.out.println("�ݾ��� �ٽ� �Է����ּ���");
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
	 * �ܾ� Ȯ��
	 */
	public void bankSelect() {
		try {
			System.out.println("�ܾ� ��ȸ�� ���¸� �Է����ּ���");
			int bankNo = Integer.parseInt(sc.nextLine());
			String password = null;
			while (true) {

				System.out.println("��й�ȣ�� �Է��ϼ���");

				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("�н����带 �Է����ּ��� ");
				} else {
					break;
				}
			}
		
			BankVO vo = dao.bankSelectCheck(bankNo, password);
			System.out.println("���� �� : " + vo.getName() + "/ �ܾ� : " + vo.getBlance());
		} catch (SQLException | BankNoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BankPassWordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * �Ա�
	 */
	public void bankBlanceUpdatePlus() {

		try {
			System.out.println("�Ա� ���¹�ȣ�� �Է����ּ���");
			int bankNo = Integer.parseInt(sc.nextLine());
			String password = null;
			while (true) {

				System.out.println("�Ա� ��й�ȣ�� �Է��ϼ���");
				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("�н����带 �Է����ּ��� ");
				} else {
					break;
				}
			}
			System.out.println("�Ա� �ݾ��� �Է����ּ���");
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
	 * ���
	 */
	public void bankBlanceUpdateMinus() {
		String password = null;
		try {
			System.out.println("����� ���¸� �Է����ּ���");
			int bankNo = Integer.parseInt(sc.nextLine());
			while (true) {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("�н����带 �Է����ּ��� ");
				} else {
					break;
				}
			}
			BankVO vo = dao.bankSelectCheck(bankNo, password);
			System.out.println("����� �ݾ��� �Է����ּ���");
			int blance = Integer.parseInt(sc.nextLine());
			if (vo.getBlance() < blance)
				throw new BankBlanceException("�ܾ��� �����մϴ�.");
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
	 * ������ü
	 */
	public void bankBlanceUpdateMinus2() {

		try {
			System.out.println("���¹�ȣ�� �Է����ּ���");
			int bankNo = Integer.parseInt(sc.nextLine());
			String password = null;
			while (true) {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				password = sc.nextLine();
				if (password.equals("null") || password == null || password.trim().equals("")) {
					System.out.println("�н����带 �Է����ּ��� ");
				} else {
					break;
				}
			}
			BankVO vo = dao.bankSelectCheck(bankNo, password);

			System.out.println("��ü�� ���¹�ȣ�� �Է����ּ���;");
			int bankNo2 = Integer.parseInt(sc.nextLine());
			dao.bankSelectCheck(bankNo2);
			System.out.println("��ü�� �ݾ��� �Է����ּ���");
			int blance = Integer.parseInt(sc.nextLine());
			if (vo.getBlance() < blance)
				throw new BankBlanceException("�ܾ��� �����մϴ�.");
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
