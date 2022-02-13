/* [입출력] #2442 별 찍기 ver5 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class IO_2442 {
 
    public static void main(String[] args) throws IOException{ 
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int q = 0; q < n - i - 1; q++)
                sb.append(" ");
          
            for(int q = 0; q<2 * i + 1; q++)
                sb.append("*");
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
 
} 