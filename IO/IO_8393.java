/* [입출력] #8393 합  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_8393 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		int total = 0;
		
		for (int i = 1; i <= num; i++) {
			total += i;
		}
		
		System.out.println(total);
	}

}
