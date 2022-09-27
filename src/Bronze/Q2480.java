package Bronze;

import java.util.Scanner;

public class Q2480 {
	
	public static int max(int a, int b) {
		return (a>b) ? a : b;
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = function(a, b, c);
		
		if(a==b && b==c) {
			System.out.println(10000 + a*1000);
		} else if(a==b || a==c) {
			System.out.println(1000 + a*100);
		} else if(b==c) {
			System.out.println(1000 + b*100);
		} else {
			System.out.println(100*d);
		}
	}

}
