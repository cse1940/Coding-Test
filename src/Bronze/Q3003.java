package Bronze;

import java.util.Scanner;

public class Q3003 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		for(int i=0; i<chess.length; i++) {
			int now = s.nextInt();
			System.out.print(chess[i] - now + " ");
		}
		

	}

}
