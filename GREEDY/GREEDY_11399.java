/* [그리디] 
 * #11399 
 * ATM */

import java.util.Scanner;
import java.util.Arrays;

public class GREEDY_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 사람의 수
		Integer[] time = new Integer[n]; // 각 사람이 인출하는 데 걸리는 시간에 대한 배열
		
		for (int i = 0; i < n; i++)
			time[i] = sc.nextInt();
		
		Arrays.sort(time);
		
		int total = 0;
		for (int i = 0; i < n; i++) {
			int j = n - i;
			total = total + time[i] * j;
		}
		
		System.out.println(total);
		
		sc.close();
	}
}
