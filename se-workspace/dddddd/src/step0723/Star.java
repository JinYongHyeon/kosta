package step0723;

public class Star {
	public void a() {
		for (int i = 0; i < 5; i++) {
			for (int p = 5; p > i+1; p--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("**");
			}

			System.out.println();
		}
	}
	
	public void b() {
		for (int i = 0; i < 5; i++) {
			for (int p = 1; p <= i; p++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print("**");
			}

			System.out.println();
		}
	}
	
	public void c() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Star s = new Star();
		//s.a();
		//s.b();
		  s.c();
		  

	}

}
