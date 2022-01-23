import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_14888 {
    public static int n; // n개의 수
    public static int[] a; // 수열
    public static int[] sign = new int[4]; // + - * / 기호의 개수
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); 
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer(br.readLine()); 
        for (int i = 0; i < sign.length; i++) {
            sign[i] = Integer.parseInt(st1.nextToken());
        }

        findMinMax(a[0], 1);

        System.out.println(max);
        System.out.println(min);

        br.close();
    }

    public static void findMinMax(int sum, int index) {
        if (index == n) {
            max = Math.max(sum, max);
            min = Math.min(sum, min);
        }
        
        for (int i = 0; i < 4; i++) {
            if (sign[i] > 0) {
                sign[i]--;

                switch(i) {
                    case 0: 
                        findMinMax(sum + a[index], index + 1);
                        break;
                    case 1: 
                        findMinMax(sum - a[index], index + 1); 
                        break;
                    case 2: 
                        findMinMax(sum * a[index], index + 1); 
                        break;
                    case 3: 
                        findMinMax(sum / a[index], index + 1);  
                        break;
                }

                sign[i]++;
            }
        }
        
    }
}
