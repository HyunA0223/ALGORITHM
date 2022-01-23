/* #10808 알파벳 개수  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DS_10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] num = new int[26]; // 알파벳 개수 넣을 배열(크기, 런타임 에러 주의)
		String str = br.readLine();
		
		for (char ch : str.toCharArray()) {
			num[ch - 97]++;
		}
		
		for (int i = 0; i < num.length; i++) {
			sb.append(num[i]).append(" ");
		}
		
		System.out.println(sb);
	}

}
