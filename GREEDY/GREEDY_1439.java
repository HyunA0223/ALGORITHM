/* [그리디] 
 * #1439
 * 뒤집기 */

import java.util.Scanner;

public class GREEDY_1439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] num = s.split("");
		
		int zero = 0; // 0의 개수
		int one = 0; // 1의 개수
		
		if (num[0].equals("0")) zero++;
		else one++;
		
		for (int i = 1; i < num.length; i++) { // 문자열에서 0괴 1의 개수를 계산
			if (!num[i].equals(num[i - 1])) { // 앞의 수와 다를 때
				if (num[i].equals("0"))
					zero++;
				else
					one++;
			}
		}
		
		System.out.println(Math.min(zero, one));
		
		sc.close();
	}

}
