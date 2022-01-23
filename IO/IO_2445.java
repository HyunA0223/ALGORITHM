/* [입출력] #2445 별 찍기 ver8 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2445 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				sb1.append("*");
			}
			for (int j = i; j < n; j++) {
				sb1.append(" ");
			}
			for (int j = i; j < n; j++) { 
				sb1.append(" ");
			}
			for (int k = 0; k < i; k++) {
				sb1.append("*");
			}
			sb1.append("\n");
		}
		
		for (int i = n - 1; i >= 1; i--) {
			for (int j = i; j > 0; j--) 
				sb2.append("*");
			for (int k = n - i; k > 0; k--)
				sb2.append(" ");
			for (int k = n - i; k > 0; k--)
				sb2.append(" ");
			for (int j = i; j > 0; j--) 
				sb2.append("*");
			sb2.append("\n");
		}
		
		System.out.print(sb1);
		System.out.println(sb2);
	}

} 