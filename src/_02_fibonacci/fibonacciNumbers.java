package _02_fibonacci;

public class fibonacciNumbers {
	static int a = 0;
	static int b= 1;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		int c = a+b;
		System.out.println(c);
		for(int i = 0;i<3;i++) {
		a = b+c;
		System.out.println(a);
		b=a+c;
		System.out.println(b);
		c=b+a;
		System.out.println(c);
		}
		
	}
}
