/* [그리디] 
 * #9237 
 * 이장님 초대 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class GREEDY_9237 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 심을 나무 묘목의 개수
		
		Integer[] t = new Integer[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt(); // 각 나무가 자라는 데 걸리는 시간
		}
		
		Arrays.sort(t, Collections.reverseOrder()); // 내림차순 정렬
		
		int p = t[0] + 1; // 마지막 나무까지 모두 자란 날
		for (int i = 1; i < n; i++) {
			if (p < t[i] + (i + 1))
				p = t[i] + (i + 1);
		}
		
		System.out.println(p + 1); // 모든 나무가 자란 다음 날
		
		sc.close();
	}

}
