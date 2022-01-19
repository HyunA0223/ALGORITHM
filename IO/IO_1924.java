/* [입출력] #1924 2007년  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_1924 {

	static int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str, " "); 
		
		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int total = 0;
		StringBuilder day = new StringBuilder();
		
		for (int i = 0; i < (m - 1); i++) {
			total += month[i];
		}
		total += d;
		
		if (total % 7 == 0) day.append("SUN");
		else if (total % 7 == 1) day.append("MON");
		else if (total % 7 == 2) day.append("TUE");
		else if (total % 7 == 3) day.append("WED");
		else if (total % 7 == 4) day.append("THU");
		else if (total % 7 == 5) day.append("FRI");
		else day.append("SAT");
		
		System.out.println(day);
	}

}
