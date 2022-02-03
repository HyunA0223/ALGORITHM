/* [그리디] 
 * #2217 
 * 로프 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class GREEDY_2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Integer[] rope = new Integer[N];
		for (int i = 0; i < N; i++) {
			rope[i] = sc.nextInt();
		}
		
		// 각 로프의 최대 중량 내림차순 정렬
		Arrays.sort(rope, Collections.reverseOrder());
		
		int W = rope[0];
		int cW = 0;
		
		for (int i = 1; i < N; i++) {
			cW = rope[i] * (i + 1);
			if (W < cW)
				W = cW;
		}
		
		System.out.println(W);
		
		sc.close();
	}

}
