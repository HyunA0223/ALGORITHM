/*
 * 1. 다솜이 가장 많은 표 수가 아닐 경우 -> 다솜이 가장 많아질 때까지 반복
 * 	1-1. 다솜 제외 가장 많은 표 수를 받은 사람 - 1 && 다솜 + 1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GREEDY_1417 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());// 국회의원 후보 n명
		
		int[] pick = new int[n]; // 각 후보를 찍으려고 하는 사람
		for (int i = 0; i < n; i++) {
			pick[i] = Integer.parseInt(bf.readLine());
		}
		
		int ans = 0; // 매수해야하는 사람의 수
		while (true) { // 다솜이 가장 많아질 때까지 반복
			int maxIndex = 0;
			
			for (int i = 0; i < n; i++) {
				if (pick[i] >= pick[maxIndex]) {
					maxIndex = i;
				}
			}
			
			if (maxIndex == 0) break;
			
			pick[maxIndex]--; // 가장 많은 표 수를 받은 사람 - 1
			pick[0]++; // 다솜  + 1
			ans++; 
		}
		
		System.out.println(ans);
	}

}
