/* [입출력] #2441 별 찍기 ver4 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2441 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++) 
				sb.append(" ");
			for (int k = n - i; k < n; k++)
				sb.append("*");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
 } 