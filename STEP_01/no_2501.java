import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        int count = 0;
        int result = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                result = i;
                count++;
                if (count == index) break;
            }
        }

        if (count == index) System.out.print(result);
        else System.out.println(0);

        br.close();
    }
}
