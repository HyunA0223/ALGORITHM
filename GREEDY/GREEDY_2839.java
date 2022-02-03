/* [그리디] 
 * #2839 
 * 설탕 배달 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GREEDY_2839 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 클래스의 사용 시간보다 더 짧음
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = N / 5; i >= 0; i--) {
			int rest = N - 5 * i;
			if (rest % 3 == 0) {
				System.out.println(i + rest / 3);
				break;
			}
			else if (i == 0 && rest % 3 != 0){
				System.out.println("-1");
				break;
			}
		}
		
	}

}
