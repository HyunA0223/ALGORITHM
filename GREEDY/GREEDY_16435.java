/* [그리디] #16435 스네이크 버드
 * 
 * 과일의 개수 N, 스네이크 버드의 초기 길이 K
 * k보다 작거나 같은 높이에 있는 과일만 먹을 수 있음, 과일 하나당 K+1
 * 
 * 1. 과일 목록 오름차순 정렬
 * 2. 길이보다 작거나 같으면 그 개수만큼 k++
 * 3. 길이보다 크면 더 이상 섭취 불가
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GREEDY_16435 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken()); // 과일의 개수 n
		int k = Integer.parseInt(st.nextToken()); // 스네이크 버드 초기 길이 k
		
		String s2 = bf.readLine();
		StringTokenizer st2 = new StringTokenizer(s2);
		Integer[] fruit = new Integer[n]; // 과일 목록
		for (int i = 0; i < fruit.length; i++) {
			fruit[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(fruit); // 과일 오름차순 정렬
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i] <= k) k++;
			else break;
		}
		
		System.out.println(k);
	}

}
