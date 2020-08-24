package step1;

import java.util.Scanner;

class Character {
	public void leftMouse() {
		System.out.println("���� Ŭ��");
	}

	public void rightMouse() {
		System.out.println("������ Ŭ��");
	}
}

class McCree extends Character {
	@Override
	public void leftMouse() {
		System.out.println("������ �߻�");
	}

	@Override
	public void rightMouse() {
		System.out.println("������ ����");
	}
}

class Reaper extends Character {
	@Override
	public void leftMouse() {
		System.out.println("���� �߻�");
	}

	@Override
	public void rightMouse() {
		System.out.println("������ ���µ��");
	}
}

class MiniReper extends Reaper{
	
	public void money() {
		System.out.println("���� �ְ��.");
	}
}

class Effect {
	public void action(Character c) {
		c.leftMouse();
		c.rightMouse();
	}
}

public class OverWatch {

	public static void main(String[] args) {
		
		Character r2 = new MiniReper();
				
		MiniReper m =(MiniReper) r2;
		
		m.money();	
		
		Effect ef = new Effect();
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		if (point == 1) {
			ef.action(new McCree());
		}else if (point == 2) {
			ef.action(new Reaper());
		}else {
			System.out.println("ĳ���� ���� ���ư�");
		}
		
		sc.close();

	}

}
