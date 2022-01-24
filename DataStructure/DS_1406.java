import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class DS_1406 {

	public static void 	main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<String> stack1 = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			stack1.push(str.substring(i, i + 1)); // 문자열
		}
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer command = new StringTokenizer(br.readLine());
			String c = command.nextToken();
			switch(c) {
			case "P":
				stack1.push(command.nextToken());
				break;
			case "L":
				if (!stack1.isEmpty())
					stack2.push(stack1.pop());
				break;
			case "D":
				if (!stack2.isEmpty())
					stack1.push(stack2.pop());
				break;
			
			case "B":
				if (!stack1.isEmpty()) {
					stack1.pop();
				}
				break;
			}
		}
		
		while(!stack1.isEmpty()) // stack.size()만큼 반복하면 pop할 때 개수가 줄기 때문에 전부 출력 X
			stack2.push(stack1.pop());
		while(!stack2.isEmpty())
			bw.write(stack2.pop());
		
		br.close();
		bw.flush();
		bw.close();
	}

}
