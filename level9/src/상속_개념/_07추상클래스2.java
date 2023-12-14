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
		
		//이미 child2는 Parent2를 상속받고 있기 때문에 자동으로 형변환이 일어남
		Parent2 c2 = new child2();
		//System.out.println(c2.b);
		//downcasting

		//child2 c3 = new Parent2(); // 자식 클래스 타입이 부모 클래스 타입을 가지는 것은 불가능

		//child2 c3 = (child2)new Parent2(); // 강제 형변환을 통해 가능은 하지만 실행시 에러 발생

		child2 c3 = (child2)c2; 
		System.out.println(c3.b);
	}

}
