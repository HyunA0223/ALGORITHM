/* [그리디] #19939 박 터뜨리기
 * 
 * 공의 개수 N, 팀의 수 K
 * N개의 공을 K개의 바구니에 빠짐없이 나누어 담음
 * 각 바구니에는 1개 이상의 공, 공의 개수는 모두 달라야함
 * 가장 많이 담긴 바구니와 가장 적은 바구니의 공의 개수가 최소가 되어야 함
 * 
 * total = k + (k - 1) + ... + 1
 * 1. n < total 이면 -1
 * 2. n >= total 이면
 *  rest = total % k
 *  2-1. n % k == rest 이면 (k - 1) 출력
 *  2-2. n % k != rest 이면 K 출력
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GREEDY_19939 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int n = Integer.parseInt(st.nextToken()); // 공의 개수 n
		int k = Integer.parseInt(st.nextToken()); // 바구니(팀)의 수
		
		int total = 0;
		for (int i = k; i >= 1; i--) { // n의 최소값 total
			total += i;
		}
		
		if (n < total) { // 공이 나눠지지 않을 경우 -1
			System.out.println(-1);
			return;
		}
		else { // 공이 나눠질 경우
			int rest = total % k;
			if (n % k == rest) {
				System.out.println(k - 1);
				return;
			}
			else {
				System.out.println(k);
				return;
			}
		}
	}

}
