package Bronze;

import java.util.Scanner;

public class Q10952 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
		}

	}

}
