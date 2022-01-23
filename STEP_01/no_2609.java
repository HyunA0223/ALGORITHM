import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int multiple = 1; int factor = 0;

        for (int i = n1; i > 0; i--) {
            if (n1 % i == 0) {
                if (n2 % i == 0) {
                    factor = i;
                    break;
                }
                
            }
        }

        int large = Math.max(n1, n2);
        int small = Math.min(n1, n2);


        for (int i = 1; multiple < n1 * n2; i++) {
            multiple = large * i;
            if (multiple % small == 0) {
                break;
            }
        }

        System.out.println(factor);
        System.out.println(multiple);

        br.close();
    }
}