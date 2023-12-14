package 상속_개념;

class Parent{
	int num = 100;

	void test1(){
		System.out.println("부모클래스의 test1 메서드");
	}

}

class child extends Parent{
	int num = 10;
	// 메서드 오버라이딩 : 부모클래스의 메서드를 자식클래스에서 재정의 하는 것
	void test1(){
		System.out.println("자식클래스의 test1 메서드");
	}
	void test2(){
		System.out.println("자식클래스의 test2 메서드");
		super.test1(); // 부모클래스의 test1 메서드를 호출
	}
	void printNum(){
		System.out.println("num : " + num);
		System.out.println("super.num : " + super.num);
	}
}
public class _03오버라이딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();
		c.test1();
		c.test2();	
		c.printNum();
	}

}
