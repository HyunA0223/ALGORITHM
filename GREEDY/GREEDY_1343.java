/* [그리디] 
 * #1343
 * 폴리오미노
 * 
 * AAAA, BB 폴리오미노 -> X를 겹침없이 폴리오미노로 덮음
 * 1. . 이면 . 출력 후 다음 문자로 넘어감 
 * 2. X가 홀수개면 -1
 * 3. X가 짝수이면
 *  3-1. X가 4개 이상일 경우 AAAA 출력, X의 개수 - 4
 *  3-2. X가 4개 이하일 경우 BB 출력, X의 개수 - 2 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GREEDY_1343 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String arr = bf.readLine();
		StringBuilder ans = new StringBuilder(); // 출력할 폴리오미노
		int numX = 0;
		
		for (int i = 0; i < arr.length();) {
			if (arr.charAt(i) == '.') { // X가 아니면 . 그대로 출력
				i++;
				ans.append('.');
			}
			
			for (int j = i; j < arr.length() && arr.charAt(j) == 'X'; j++) { // X의 개수만큼 numX++
				numX++;
			}
			
			i += numX;
			
			if (numX % 2 != 0) { // X가 홀수개면 -1
					System.out.println(-1);
					return;
			}
			
			while (numX != 0) { // X의 개수만큼 AAAA or BB 출력
				if (numX >= 4) { // X가 4개 이상이면 AAAA 출력 후 numX를 4만큼 감소시킴
					ans.append("AAAA");
					numX -= 4;
				} 
				else { // X가 4개 이상이면 BB 출력 후 numX를 2만큼 감소시킴
					ans.append("BB");
					numX -= 2;
				}
			}
			
		}
		
		System.out.println(ans);
	
	}
}
