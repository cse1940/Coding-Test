package Bronze;

import java.util.Scanner;

public class Q2739 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int m=1; m<10; m++) {
			System.out.println(n + " * " + m + " = " + n*m);
		}

	}

}
