package 상속_개념;

class A2{
	int a;
	A2(){
		System.out.println("A2 생성자 호출");
	}	
}
class B2 extends A2{
	int b;
	B2(){
		System.out.println("B2 생성자 호출");
	}
}
class C2 extends B2{
	int c;
	C2(){
		System.out.println("C2 생성자 호출");
	}
}

public class _02상속2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a = new A2();
		B2 b = new B2();
		C2 c = new C2();
	}

}
