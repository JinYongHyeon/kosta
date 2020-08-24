package bank.model;

import bank.cnotroller.BankController;

public class TestBank {

	public static void main(String[] args) {
		BankController controller = new BankController();
		//controller.bankInsert();
		//System.out.println("****select****");
		//controller.bankSelect();
		//System.out.println("****update****");
		controller.execute();
		//controller.bankBlanceUpdatePlus();
		//controller.bankSelect();
		//controller.bankBlanceUpdateMinus();
		//controller.bankBlanceUpdateMinus2();
		
		
		
	}

}
