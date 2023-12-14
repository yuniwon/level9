package 상속_개념;

class Product{
	String name;
	int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}
class Fruit extends Product{
	String origin;
	public Fruit(String name, int price, String origin) {
		super(name, price);
		this.origin = origin;
	}
}
public class _04super생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f = new Fruit("사과", 1000, "대구");
		System.out.println(f.name);
		System.out.println(f.price);
		System.out.println(f.origin);
	}

}
