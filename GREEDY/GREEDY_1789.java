/* [그리디] 
 * #1789 
 * 수들의 합 */

import java.util.Scanner;

public class GREEDY_1789 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// long 변수를 int로 하면 런타임 에러!! 주의하기
		long S = sc.nextInt(); 
		long total = 0; 
		int N = 0;
		
		int i = 0;
		while (total <= S) { 
			total += ++i;
			if (total > S) {
				break;
			}
			N++;
		} 
		
		System.out.println(N);
		
		sc.close();
	}
}
