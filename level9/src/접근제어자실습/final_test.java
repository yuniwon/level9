package 접근제어자실습;

public class final_test {
    public static void main(String[] args) {
        final int a = 10;
        // a = 20; // final 변수는 값 변경 불가
        final int b;
        b = 20;
        // b = 30; // final 변수는 값 변경 불가
        final int c = 30;
        // c = 40; // final 변수는 값 변경 불가
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
