package 접근제어자실습;


//abstract // 추상화 : abstract <-> 구체화	
// 클래스를 설계 : 상태(데이터), 행동(기능, 메서드)

// 추상클래스는 구체적이지 않기 때문에 행동 : 메서드의 구현체{}가 빠져있다.

//단 하나라도 추상메서드를 가지고 있으면 추상클래스가 된다.
abstract class A{
	
	abstract void test();///구현부가 빠져있어서 앞에 abstract 키워드 붙여줘야함
	
	//완전한 메서드
	void test2() {
		System.out.println("호출2"); 
	}
}

class B extends A{

	@Override
	void test() {
		System.out.println("호출1");
		
	}
	
	
	
}

public class _06추상클래스 {

	public static void main(String[] args) {
		// 미완성된 설계도는 객체를 생성할 수 없다.
		// 추상 클래스는 객체를 만들 수 없다.
		
		//A a = new A();
		B b = new B();
		b.test();
		b.test2();

	}

}
