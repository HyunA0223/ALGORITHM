import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class DS_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(bf.readLine());
		Integer[] seq = new Integer[n];
		boolean isAble = true;
		
		int num = 1; 
		for (int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(bf.readLine()); // 수열 입력

			if (isAble) { 
				if (num <= seq[i]) { // num++가 seq[i]보다 클 때까지 push
					while (num <= seq[i]) {
						stack.push(num++);
						sb.append("+\n");
					}
				}
				if (stack.isEmpty()) isAble = false;
				else { // 스택의 top이 seq[i]보다 작을 때까지 pop
					while (stack.peek() >= seq[i]) {
						stack.pop();
						sb.append("-\n");
						if (stack.isEmpty()) break;
					}
				}
				
			}
		}
		
		if (!isAble) System.out.println("NO");
		else System.out.println(sb);
		
		bf.close();
		bw.flush();
		bw.close();
	}

}
