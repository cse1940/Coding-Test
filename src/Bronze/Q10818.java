package Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] array = new int[N];
		
		for(int i=0; i<N; i++) {
			array[i] = s.nextInt();
		}
		
		Arrays.sort(array); // ������������ �������ִ� �޼ҵ�
		System.out.println(array[0] + " " + array[array.length -1]);

	}

}
