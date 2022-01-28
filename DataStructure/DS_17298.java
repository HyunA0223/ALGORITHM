/* #17298 오큰수  */
// 스택으로 풀어야함 -> 이중 반복문은 시간 초과 뜸
// 스택에 수열의 인덱스를 넣음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class DS_17298 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] seq = new int[n];
		for (int i = 0; st.hasMoreTokens(); i++)
			seq[i] = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
				seq[stack.pop()] = seq[i];
			}
			stack.push(i);
		}
		
		while (!stack.isEmpty())
			seq[stack.pop()] = -1;
			
		for (int i = 0; i < n; i++) {
			sb.append(seq[i]).append(" ");
		}
		
		System.out.println(sb);
		
		br.close();
	}

}
