/* #10799 쇠막대기 */
// 스택 풀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DS_10779 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		
		String s = br.readLine();
		char[] ch = s.toCharArray();
		
		int ans = 0;
		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case '(': // ( 일 경우 push
				stack.push('(');
				break;
			case ')': // ) 일 경우
				if (ch[i - 1] == '(') { // 앞이 (이면 pop 후 스택 사이즈만큼 갯수 증가
					stack.pop();
					ans += stack.size();
				}
				else { // 앞이 ) 이면 pop 후 개수 1 증가
					stack.pop();
					ans++;
				}
				break;
			}
		}
		System.out.println(ans);
	}

}
