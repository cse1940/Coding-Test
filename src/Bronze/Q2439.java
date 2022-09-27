package Bronze;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=N-i-1; j>0; j--) {
				System.out.print(" "); // space
		}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			} System.out.println();

	}

  }
}
