package Bronze;

import java.util.Scanner;

public class Q10871 {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int X = s.nextInt();
		
		int z[] = new int[N]; // N�� ������ŭ �迭�� ����.
		for(int i=0; i<N; i++) { // N�� �ݺ��ϴ� �ݺ���
			z[i] = s.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(z[i] < X) {
				System.out.print(z[i] + " ");
			}
		}
		

	}

}
