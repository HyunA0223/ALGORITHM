/* [그리디] 
 * #14241
 * 슬라임 합치기 */

import java.util.Scanner;

public class GREEDY_14241 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 슬라임 개수
		Integer[] size = new Integer[n]; // 슬라임 크기
		for (int i = 0; i < n; i++) {
			size[i] = sc.nextInt();
		}
		
		int total = size[0] + size[1]; // 합친 슬라임 크기 x + y
		int score = size[0] * size[1]; // 얻는 점수 x * y
		for (int i = 2; i < n; i++) {
			score = score + total * size[i];
			total += size[i];
		}
		
		System.out.println(score);
		
		sc.close();
	}

}
