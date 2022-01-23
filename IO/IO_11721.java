/* [입출력] #11721 열개씩 끊어 출력하기  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_11721 {

	public static void main(String[] args) throws IOException {	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		sb.append(bf.readLine());
		
		int num = 0;
		for (int i = 0; i < sb.length(); i++) {
			num++;
			System.out.print(sb.charAt(i));
			if (num % 10 == 0) {
				System.out.println();
			}
		}
	}

}
