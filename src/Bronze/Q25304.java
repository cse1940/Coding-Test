package Bronze;

import java.util.Scanner;

public class Q25304 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int n = s.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			sum = a*b + sum;
		}
		
		if(sum == x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
