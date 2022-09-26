package Bronze;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		String b = s.next();
		
		System.out.println(a * (b.charAt(2) -'0'));
		System.out.println(a * (b.charAt(1) -'0'));
		System.out.println(a * (b.charAt(0) -'0'));
		System.out.println(a * Integer.parseInt(b));
		

	}

}
