/* [입출력] #2439 별 찍기 ver2 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) 
				sb.append(" ");
			for (int k = 1; k <= i; k++)
				sb.append("*");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

} 