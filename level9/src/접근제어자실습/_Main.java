package 접근제어자실습;

import 상속_개념.AccessTest;

class child extends AccessTest{
	child(){
		super.a = 10;
		b = 100;
		
	}
}
public class _Main {
	public static void main(String[] args) {
		child c = new child();
		c.a = 10;
		// c.b = 100; // protected는 같은 패키지에서만 접근 가능 

	}
}
