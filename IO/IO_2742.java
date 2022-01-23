/* [입출력] #2742 기찍 N  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int i = n; i >= 1; i--) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

}