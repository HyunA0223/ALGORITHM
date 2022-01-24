import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class DS_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // n명의 사람들 중
		int k = Integer.parseInt(st.nextToken()); // k번째 제거
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		for (int i = 1; i <= n; i++) 
			dq.offer(i);
		
		sb.append("<");
		while (dq.size() != 1) {
			for (int i = 0; i < k - 1; i++) { // 1. k번째 전의 사람들을 poll하여 offer
				dq.offer(dq.poll());
			}
			sb.append(dq.poll() + ", "); // 2. k번째 사람은 poll하여 순열에 추가
		}
		sb.append(dq.poll() + ">"); // 3. 마지막 사람은 , 없이 순열에 추가
		
		System.out.println(sb);
		
		br.close();
	}
}
