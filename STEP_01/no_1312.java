import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken()); // n번째 자리 수

        int calc =  a % b;
        for (int i = 1; i < n; i++) {
            calc *= 10;
            calc %= b;
        }
        calc = calc * 10 / b;
        System.out.println(calc);

        br.close();
    }
}
