/* [입출력] #2440 별 찍기 ver3 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2440 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i = n; i >= 1; i--) {
			sb1.append("*");
		} 
		sb2.append(sb1 + "\n");
		for (int i = n - 1; i >= 0; i--) {
			sb1.delete(i, n);
			sb2.append(sb1 + "\n");
		}
		
		System.out.println(sb2);
	}

} 