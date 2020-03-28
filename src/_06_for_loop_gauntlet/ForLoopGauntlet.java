package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		//SINGLE FOR LOOPS
		//1.
		for(int i=0;i<101;i++) {
			System.out.println(i);
		}
		//2.
		for(int i=100;i>-1;i--) {
			System.out.println(i);
		}
		//3.
		for(int i=2;i<101;i+=2) {
			System.out.println(i);
		}
		//4.
		for(int i=1;i<100;i+=2) {
			System.out.println(i);
		}
		//5.
		for(int i=1;i<501;i++) {
			if(i%2==0) {
				System.out.println(i + " is even");
			}else {
				System.out.println(i + " is odd");
			}
		}
		//6.
		for(int i=0;i<112;i++) {
			System.out.println(i*7);
		}
		//7.
		for(int y=2008;y<2021; y++) {
			int alive = y-2008;
			System.out.println("In " + y + ",I was" + alive);	
		}
		//NESTED FOR LOOPS
		//1.
		for(int n=0; n<3;n++) {
			for(int i=0;i<3;i++) {
				System.out.println(n + " " + i);
			}
		}
		//2.
		for(int i = 0; i< 8 ;i +=3 ) {
			for(int n = 1; n < 4; n++) {
				System.out.print((i+n) + " ");
			}
			System.out.println();
		}
		//3.
		for(int i = 0; i< 91 ;i +=10 ) {
			for(int n = 1; n < 11; n++) {
				System.out.print((i+n) + " ");
			}
			System.out.println();
		}
		//4.
		for(int i = 1; i < 7; i++) {
			for(int n=i;n>0;n--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//BONUS
		for(int i=0; i<100;i++) {
			System.out.println((100-i));
		}
		
		
		
		
		
		
	}
}
