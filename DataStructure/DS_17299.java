/* #17299 오등큰수  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class DS_17299 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
	
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] NGF = new int[n]; // 오등큰수에 대한 배열 == 결과
		
		int[] seq = new int[n]; // 수열
		for (int i = 0; st.hasMoreTokens(); i++)
			seq[i] = Integer.parseInt(st.nextToken());
		
		int[] count = new int[1000001]; // 수열의 각 숫자의 개수에 대한 배열 (크기 주의!!! 범위 꼭 확인하기!!!)
		for (int i = 0; i < n; i++) {
			count[seq[i]]++;
		}
		
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && count[seq[stack.peek()]] < count[seq[i]]) {
				NGF[stack.pop()] = seq[i];
			}
			stack.push(i);
		}
		
		while (!stack.isEmpty()) // 오등큰수가 없으면 -1
			NGF[stack.pop()] = -1;
			
		for (int i = 0; i < n; i++) {
			sb.append(NGF[i]).append(" ");
		}
		System.out.println(sb);
		
		br.close();
	}

}
