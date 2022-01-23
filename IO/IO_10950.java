/* [입출력] #10950 A+B ver3 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_10950 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		int a, b;
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			System.out.println(a + b);
		}
	}

}
