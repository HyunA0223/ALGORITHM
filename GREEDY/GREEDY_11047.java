/* [그리디] 
 * #11047 
 * 동전 0 */

import java.util.Scanner;

public class GREEDY_11047 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int N = sc.nextInt(); // 동전의 갯수
		int K = sc.nextInt(); // 동전으로 만들어야 할 합
		Integer[] money = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			money[i] = sc.nextInt();
		}
		
		for (int i = N - 1; i >= 0; i--) {
			if (K >= money[i]) {
				total += K / money[i];
				K %= money[i];
			}
		}

		System.out.println(total);
		
		sc.close();
	}

}
