/* [입출력] #2741 N 찍기  */
// StringBuilder 이용하여 시간 단축(180ms)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2741 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		//for (int i = 1; i <= n; i++) System.out.println(i); 
		//	-> 1396ms
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

}
