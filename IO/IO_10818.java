/* [입출력] #10818 최소,최대  */

import java.util.Scanner;

public class IO_10818 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int min = num[0];
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			min = Math.min(min, num[i]);
			max = Math.max(max, num[i]);
		}
		
		System.out.println(min + " " + max);
		
		sc.close();
	}

}
