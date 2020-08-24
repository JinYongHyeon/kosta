package step4;


class GrandParent {
	public GrandParent() {
		System.out.println("炼何葛 按眉 积己");
	}
}

class Parent extends GrandParent {
	
	public Parent() {
		System.out.println("何葛 按眉 积己");
	}
}


class Child extends Parent{		
	public Child() {
		System.out.println("磊侥 按眉 积己");
	}
}
public class TestSuper2 {

	public static void main(String[] args) {
		new Child();
	}

}
