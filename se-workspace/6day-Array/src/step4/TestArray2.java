package step4;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] salary = new int[4];
		int sum = 0;
		System.out.println(salary.length);
		
		salary[0]=1000;
		salary[1]=300;
		salary[2]=200;
		salary[3]=500;
		
		for(int i=0; i<salary.length;i++) {
			sum += salary[i];
		}
		System.out.println("รัพื : "+sum);
		
		int sum2 =0;
		for(int workSalary : salary) {
			sum2 += workSalary;
		}
		System.out.println(sum2);
	}

}
