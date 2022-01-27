/* #10809 알파벳 찾기  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DS_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int pos = -1; // 알파벳 위치
		int[] num = new int[26];
		String str = br.readLine();
		
		// 초기화
		for (int i = 0; i < num.length; i++)
			num[i] = pos;
		
		for (char ch : str.toCharArray()) { 
			pos++;
			if (num[ch - 97] == -1)
				num[ch - 97] = pos;
		}
		
		for (int i = 0; i < num.length; i++) {
			sb.append(num[i]).append(" ");
		}
		
		System.out.println(sb);
	}

}
