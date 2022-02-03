/* [그리디] 
 * #4796 
 * 캠핑 */

import java.util.Scanner;

public class GREEDY_4796 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = 1;
		int P, V;
		
		for (int i = 1; L != 0; i++) {
			L = sc.nextInt(); // L일만 사용 가능
			P = sc.nextInt(); // 연속하는 P일 중
			V = sc.nextInt(); // V일 짜리 휴가
			
			if (L == 0) break;
			
			int R = 0;
			if (V % P >= L) R += L; // 1 8 20일 경우
			else R += (V % P); 
			
			System.out.println("Case " + i +": " + ((V / P) * L + R) );
		}
		
		sc.close();
	}

}
