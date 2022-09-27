package Bronze;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++) {
			count += i;
		}
		System.out.println(count);
		

	}

}
