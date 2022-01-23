/* [입출력] #10952 A+B ver5 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_10952 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int a = 1; 
		int b = 1;
		
		while (a != 0 && b != 0) {
			String s = bf.readLine();
			st =  new StringTokenizer(s, " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if (a == 0 && b == 0) {
				break;
			}
			
			System.out.println(a + b);
		}
	}

}
