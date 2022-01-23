import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class DS_10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		Deque<String> dq = new ArrayDeque<String>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push_front":
				dq.offerFirst(st.nextToken());
				break;
			case "push_back":
				dq.offer(st.nextToken());
				break;
			case "pop_front":
				if (dq.isEmpty()) sb.append(-1).append("\n");
				else sb.append(dq.poll()).append("\n");
				break;
			case "pop_back":
				if (dq.isEmpty()) sb.append(-1).append("\n");
				else sb.append(dq.pollLast()).append("\n");
				break;
			case "size":
				sb.append(dq.size()).append("\n");
				break;
			case "empty":
				if (dq.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
			case "front":
				if (dq.isEmpty()) sb.append(-1).append("\n");
				else sb.append(dq.peek()).append("\n");
				break;
			case "back":
				if (dq.isEmpty()) sb.append(-1).append("\n");
				else sb.append(dq.peekLast()).append("\n");
				break;
			}
		}
		System.out.println(sb);
		
		br.close();
	}

}
