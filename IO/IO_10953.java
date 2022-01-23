/* [입출력] #10952 A+B ver6 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_10953 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int n = Integer.parseInt(bf.readLine());
		
		int a = 1; 
		int b = 1;
		
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			st =  new StringTokenizer(s, ","); 
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			System.out.println(a + b);
		}
	}

}
