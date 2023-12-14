package 상속_개념;

class Parent2{
	int a;
	
}

class child2 extends Parent2{
	int b;
	
}
public class _07추상클래스2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting 자식 객체가 부모 클래스 타입을 가지는 것
		
		Parent2 p = new Parent2();
		
		child2 c1 = new child2();
		
		Parent2 c2 = new child2();
		
		//downcasting
	}

}
