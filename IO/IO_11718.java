/* [입출력] #11718 그대로 출력하기  */
// 11719와 동일 (공백 포함 출력)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_11718 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String str;
		
		while ((str = br.readLine()) != null) {
			System.out.println(sb.append(str));
			sb.delete(0, sb.length());
		}
		
	}

}
