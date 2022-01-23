import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 몇 번째 피보나치 수
        System.out.println(calcFibo(n));

        br.close();
    }

    public static int calcFibo(int n) {
        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;
        else return calcFibo(n - 1) + calcFibo(n - 2);
    }
}
