import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[1001];
        int index = 1;

        for (int i = 1; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                if (index == 1001) break;
                arr[index++] = i; 
            }
        }

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }

        System.out.println(sum);

        br.close();
    }
}
