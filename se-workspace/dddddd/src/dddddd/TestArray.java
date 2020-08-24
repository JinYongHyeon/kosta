package dddddd;

public class TestArray {

	public static void main(String[] args) {
		int [][]a = new int[10][10];
	
		
		
		
		for(int i=1; i<=a.length-1;i++) {
			for(int j=2; j<=a.length-1; j++) {
			
				a[i][j] = i*j;
				System.out.print(a[i][j]+"\t");
			
			}
			System.out.println();
		}
	}

}
