import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class GREEDY_1758 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 사람의 수
		
		Integer[] tips = new Integer[n]; // 손님에게 받는 팁
		for (int i = 0; i < n; i++) { 
			tips[i] = sc.nextInt();
		}
		Arrays.sort(tips, Collections.reverseOrder()); // 내림차순 정렬
		
		long total = 0; // long 타입으로 지정해야함!!
		for (int i = 0; i < n; i++) { // (tip - i)의 합 == 강호가 받을 돈
			if (tips[i] - i > 0) // 받을 돈이 양수일 경우에만 합에 추가
				total = total + (tips[i] - i);
		}
		
		System.out.println(total);
		
		sc.close();
	
	}
}
