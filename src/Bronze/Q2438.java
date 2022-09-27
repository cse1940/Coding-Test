package Bronze;

import java.util.Scanner;

public class Q2438 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int m=0; m<=i; m++) {
				System.out.print("*");
			} System.out.println();
		}

	}

}
