import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.LinkedList;
import java.util.StringTokenizer;

public class DS_18454 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//LinkedList<String> queue = new LinkedList<String>();
		Deque<String> dq = new ArrayDeque<String>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "push":
				dq.offer(st.nextToken());
				break;
			case "pop":
				if (dq.isEmpty()) bw.write(-1 + "\n");
				else bw.write(dq.poll() + "\n");
				break;
			case "size":
				bw.write(dq.size() + "\n");
				break;
			case "empty":
				if (dq.isEmpty()) bw.write(1 + "\n");
				else bw.write(0 + "\n");
				break;
			case "front":
				if (dq.isEmpty()) bw.write(-1 + "\n");
				else bw.write(dq.peek() + "\n");
				break;
			case "back":
				if (dq.isEmpty()) bw.write(-1 + "\n");
				else bw.write(dq.peekLast() + "\n");
				break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
