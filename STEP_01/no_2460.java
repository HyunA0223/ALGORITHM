import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;
        int max = -1;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());            
            int out = Integer.parseInt(st.nextToken()); // 내린 사람 수
            int in = Integer.parseInt(st.nextToken()); // 탄 사람 수

            total -= out;
            total += in;
            max = Math.max(total, max);
        }
        
        System.out.println(max);
        br.close();
    }
}
