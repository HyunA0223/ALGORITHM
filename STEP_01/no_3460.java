import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 

        int[] a;
        for (int i = 0; i < t; i++) {
            a = new int[10];
            String testcase = br.readLine();
            st = new StringTokenizer(testcase);

            for (int j = 0; j < 10; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            } 

            Arrays.sort(a);
            sb.append(a[7] + "\n");
        }
        System.out.println(sb);

        br.close();
    }
}
