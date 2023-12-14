package 상속_개념;

import java.util.Random;

abstract class Shape{
	String color;
	String name;
	double size;
	
	abstract void draw();
	public Shape(String color, String name, double size) {
		this.color = color;
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return name + ", " + color + ", " + size + "";
	}

	
}

class Line extends Shape{
	
	Line(String color, String name, double size) {
		super(color, name, size);
		// TODO Auto-generated constructor stub
	}

	void draw() {
		// System.out.println("선을 긋는다");
		System.out.println(toString());
	}
	
}

class Circle extends Shape{
	double area;
	int radius;
	
	Circle(String color, String name, double size, int radius, double area) {
		super(color, name, size);
		this.radius = radius;
		this.area = area;
		// TODO Auto-generated constructor stub
	}
	void draw() {
		// System.out.println("원을 그린다");
			System.out.println(toString());
	}
	public String toString() {
		return name  + ", " + color + ", " + size  + ", " + area + ", " + radius
				+ "";
	}
}

class Point extends Shape{
	
	
	Point(String color, String name, double size) {
		super(color, name, size);
		// TODO Auto-generated constructor stub
	}

	void draw() {
		// System.out.println("점을 찍는다");
			System.out.println(toString());
	}
}

class Rect extends Shape{
	double area;
	int width;
	int height;
	
	
	Rect(String color, String name, double size, int width, int height, double area) {
		super(color, name, size);
		this.width = width;
		this.height = height;
		this.area = area;
		// TODO Auto-generated constructor stub
	}


	void draw() {
		// System.out.println("사각형을 그린다");
			System.out.println(toString());
	}

	@Override
	public String toString() {
		return name  + ", " + color + ", " + size + ", "  + area + ", " + width + ", " + height ;
	}
}

class Triangle extends Shape{
	double area;
	int width;
	int height;
	
	
	Triangle(String color, String name, double size, int width, int height, double area) {
		super(color, name, size);
		this.width = width;
		this.height = height;
		this.area = area;
		// TODO Auto-generated constructor stub
	}



	void draw() {
		// System.out.println("삼각형을 그린다.");
			System.out.println(toString());
	}

	@Override
	public String toString() {
		return name  + ", " + color + ", " + size + ", "  + area + ", " + width + ", " + height ;
	}
	
}
public class _08추상클래스3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();

		String[] color = {"빨강", "파랑", "노랑", "초록", "보라"};
		String[] name = {"선", "원", "점", "사각형", "삼각형"};
		double[] size = {1.0, 2.0, 3.0, 4.0, 5.0};
		// 모양도 랜덤하게, 색깔 사이즈, 해서 도형 10개를 출력하시오.
		// 점 , 선은 기존 size 출력
		// 원, 네모, 세모는 넓이 출력
		
		// Rect[] menolist = new Rect[2];
		
		// Shape[] list = { new Line(), new Circle(), new Point(), new Rect(), new Triangle()};
		
		Shape[] list = new Shape[10];
		

		for(int i = 0; i < list.length;i++){
			list[i] = name[rd.nextInt(5)] == "선" ? new Line(color[rd.nextInt(5)], name[rd.nextInt(5)], size[rd.nextInt(5)]) : 
					name[rd.nextInt(5)] == "원" ? new Circle(color[rd.nextInt(5)], name[rd.nextInt(5)], size[rd.nextInt(5)], rd.nextInt(10), rd.nextInt(10)) :
					name[rd.nextInt(5)] == "점" ? new Point(color[rd.nextInt(5)], name[rd.nextInt(5)], size[rd.nextInt(5)]) :
					name[rd.nextInt(5)] == "사각형" ? new Rect(color[rd.nextInt(5)], name[rd.nextInt(5)], size[rd.nextInt(5)], rd.nextInt(10), rd.nextInt(10), rd.nextInt(10)) :
					new Triangle(color[rd.nextInt(5)], name[rd.nextInt(5)], size[rd.nextInt(5)], rd.nextInt(10), rd.nextInt(10), rd.nextInt(10));
					list[i].draw();
		}

	}	

}
