import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DS_9093 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < n; i++) {
			String str = bf.readLine() + "\n";
			
			for (char ch : str.toCharArray()) {
				if (ch == ' ' || ch == '\n') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(ch);
				}
				else {
					stack.push(ch);
				}
			}
			System.out.print(sb);
			sb.delete(0, str.length());
		}
	}

}
