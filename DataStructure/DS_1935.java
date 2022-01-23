/* #1935 후위표기식  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Stack;

public class DS_1935 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Double> stack = new Stack<Double>();
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		double[] charNum = new double[27]; // 알파벳에 해당하는 숫자
		for (int i = 0; i < n; i++) {
			charNum[i] = Integer.parseInt(br.readLine());
		}
		
		double result = 0; // 결과값 저장
		for (char ch : str.toCharArray()) {
			if (ch >= 65 && ch <= 90) { // 알파벳일 경우
				stack.push(charNum[ch - 65]); // charNum에 저장된 해당 알파벳의 숫자를 푸시
			}
			else { // 기호일 경우
				double num1 = stack.pop();
				double num2 = stack.pop();
				switch(ch) {
				case '+':
					result = num2 + num1;
					break;
				case '-':
					result = num2 - num1;
					break;
				case '*':
					result = num2 * num1;
					break;
				case '/':
					result = num2 / num1;
					break;
				}
				stack.push(result);
			}
		}
		DecimalFormat df = new DecimalFormat("0.00"); // 소수점 둘째자리까지 출력
		System.out.println(df.format(result));
	}

}
