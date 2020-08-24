package step1;

import java.util.Scanner;

class Character {
	public void leftMouse() {
		System.out.println("왼쪽 클릭");
	}

	public void rightMouse() {
		System.out.println("오른쪽 클릭");
	}
}

class McCree extends Character {
	@Override
	public void leftMouse() {
		System.out.println("리볼버 발사");
	}

	@Override
	public void rightMouse() {
		System.out.println("리볼버 난사");
	}
}

class Reaper extends Character {
	@Override
	public void leftMouse() {
		System.out.println("샷권 발사");
	}

	@Override
	public void rightMouse() {
		System.out.println("오른쪽 없는디요");
	}
}

class MiniReper extends Reaper{
	
	public void money() {
		System.out.println("돈이 최고야.");
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
			System.out.println("캐릭터 없음 돌아가");
		}
		
		sc.close();

	}

}
