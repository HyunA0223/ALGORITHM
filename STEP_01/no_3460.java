import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine()); // 테스트 케이스

            StringBuilder sb = new StringBuilder();
            int oneIndex = 0;
            while (n != 0) {
                if (n % 2 == 1) {
                    sb.append(String.valueOf(oneIndex) + " ");
                }
                oneIndex++;
                n /= 2;
            }
             
            System.out.println(sb);
        }
        br.close();
    }
}
