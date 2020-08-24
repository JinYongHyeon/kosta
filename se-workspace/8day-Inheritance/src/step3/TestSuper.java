package step3;

class Animal{
	Animal(){System.out.println("ani2");}
	Animal(int i){System.out.println("ani232323");}
	public void eat() {
		System.out.println("冈促");
	}
	
}
class Person extends Animal{
	//积己磊 constructor
	public Person() {
		//super()绰 何葛 积己磊甫 角青秦辑 何葛 按眉 积己窍绰 开且
		System.out.println("hi");
	}
	public Person(int i) {
		
	}
}

public class TestSuper {

	public static void main(String[] args) {
			new Person(); //按眉 积己(积己磊啊 角青)
			new Person(1);
	}

}
