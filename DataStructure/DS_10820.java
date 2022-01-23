/* #10820 문자열 분석  */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DS_10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb;
		
		int[] num; // 소문자 대문자 숫자 공백
		String str;
		
		while ((str = br.readLine()) != null) {
			sb = new StringBuilder();
			num = new int[4];
			
			for (char ch : str.toCharArray()) {
				if (ch >= 97 && ch <= 122) {  // 소문자
					num[0]++;
				}
				else if (ch >= 65 && ch <= 90) { // 대문자
					num[1]++;
				} 
				else if (ch >= 48 && ch <= 57) { // 숫자
					num[2]++;
				}
				else // 공백
					num[3]++;
			}
			for (int i = 0; i < num.length; i++) 
				sb.append(num[i]).append(" ");
		
			bw.write(sb.toString());
		}
		
		bw.flush();
		bw.close();
	}

}
