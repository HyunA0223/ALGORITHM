import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class DS_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();
		
		int n = Integer.parseInt(bf.readLine());
		String str;
		
		for (int i = 0; i < n; i++) {
			int flag = 1;
			str = bf.readLine();
			for (char ch : str.toCharArray()) {
				if (ch == '(') stack.push(ch); // ( 경우 푸시
				else { // ) 경우
					if (!stack.isEmpty()){ // 스택이 비어있지 않으면
						stack.pop();
					}
					else { // 스택이 비어있을 경우
						flag = 0;
						break;
					}
				}
			}
			if (stack.isEmpty() && flag == 1) 
				bw.write("YES\n");
			else if (!stack.isEmpty() || flag == 0) {
				bw.write("NO\n");
				stack.clear();
			}
		}
		
		bf.close();
		bw.flush();
		bw.close();
	}
}
