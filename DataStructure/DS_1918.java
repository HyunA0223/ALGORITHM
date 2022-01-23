/* #1918 후위표기식2  */
/*
	StringBuilder sb (출력용)
	Stack stack
	
	1. 피연산자일 경우 : sb.append(피연산자)
	2. 연산자일 경우 : 스택에 있는 마지막 연산자의 우선순위보다  높으면 push
	            : 같거나 낮으면  마지막 연산자보다 우선순위가 높아질 때까지 pop + sb.append
	  2-1. '(' : 우선순위가 가장 낮은 연산자, stack에 무조건 push
	  2-2. '*', '/' : '+', '-'보다 우선순위 높음
	  2-3. '+', '-' : '*', '/'보다 우선순위 낮음
	  2-4. ')' : 스택에 넣지 않음, '('가 나올 때까지 pop + sb.append
	  
	3. stack이 빌 때까지 sb.append
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DS_1918 {
	
	static int priority(char ch) { // 연산자의 우선순위 반환 함수
		if (ch == '*' || ch == '/') return 2; 
		else if (ch == '+' || ch == '-') return 1;
		else return 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		
		String str = br.readLine();
		for(char ch : str.toCharArray()) {
			if('A' <= ch && ch <= 'Z') sb.append(ch); // 피연산자의 경우 
			else { // 연산자의 경우
				switch(ch) {
				case '(': // '('는 무조건 push
					stack.push(ch);
					break;
				case ')': // '('는 '(' 나올 때까지 pop
					while(!stack.isEmpty() && stack.peek() != '(') 
						sb.append(stack.pop());
					if (stack.peek() == '(') stack.pop(); // '(' pop, 출력하지 않음
					break;
				default: // stack의 마지막 연산자보다 현재 연산자의 우선순위가 높아질 때까지 pop
					while (!stack.isEmpty() && priority(ch) <= priority(stack.peek()))
						sb.append(stack.pop());
					stack.push(ch);
				}
			}
		}
		
		while (!stack.isEmpty()) 
			sb.append(stack.pop());
		
		System.out.println(sb);
	}

}
