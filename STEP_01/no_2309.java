import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] height = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }
        Arrays.sort(height);

        int spyA = -1; 
        int spyB = -1;
        int spyHeight = sum - 100;
       
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (height[i] + height[j] == spyHeight) {
                    spyA = i; spyB = j;
                    break;
                }
            }
            if (spyA == i) break;
        }
        
        for (int i = 0; i < 9; i++) {
            if (spyA == i || spyB == i) continue;
            else System.out.println(height[i]);
        }

        br.close();
    }
}
