/* [입출력] #11720 숫자의 합  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(bf.readLine());
		sb.append(bf.readLine());
		
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			total += sb.charAt(i) - '0'; // '7'이 아스키 코드로 들어감 -> '0'을 빼주면 7이 더해짐
		}
		
		System.out.println(total);
		
	}

}
