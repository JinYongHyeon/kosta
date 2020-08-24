package step7;

public class TestFor3 {

	public static void main(String[] args) {
	  /*
	   * 1 2 3 4 5 
	   * 1 2 3 4 5
	   * 1 2 3 4 5
	   *
	   */
		
		for(int i =1; i<=3;i++) {
			for(int j=1; j<=5;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
