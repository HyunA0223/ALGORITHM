/* [입출력] #2438 별 찍기 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		/* 방법 1 (시간 오래걸림 -> 이중 반복문)
		int stars = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= stars; j++)
				System.out.print("*");
			stars++;
			System.out.println();
		}
		*/
		
		// 방법 2
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb1.append("*");
			sb2.append(sb1 + "\n");
		}
		
		System.out.println(sb2);
	}

} 