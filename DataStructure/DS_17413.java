/* #17413 단어 뒤집기2 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class DS_17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> stack = new Stack<Character>();
		boolean tag = false; // tag안의 글자인지를 판별
		String s = br.readLine();
		
		for (char ch : s.toCharArray()) {
			if (ch == '<') { 
				while (!stack.isEmpty()) // < 앞의 글자가 있다면
					bw.write(stack.pop()); // stack의 글자를 pop하여 출력
				bw.write(ch);
				tag = true; 
			}
			else if (ch == '>') {
				bw.write(ch);
				tag = false;
			}
			else if (tag) { // tag안의 글자이면 그대로 출력
				bw.write(ch);
			}
			else if (!tag){ // tag안의 글자가 아니면 
				if (ch == ' ') { // 공백일 경우
					while (!stack.isEmpty()) // stack의 글자를 pop하여 출력
						bw.write(stack.pop());
					bw.write(ch); // 공백 출력
				}
				else { // 공백이 아닐 경우
					stack.push(ch); // stack에 글자를 push
				}
			}
		}
		
		while (!stack.isEmpty()) // stack에 남아있는 마지막 단어 출력
			bw.write(stack.pop());
		
		br.close();
		bw.flush();
		bw.close();
	}

}
