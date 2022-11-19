import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no_2504 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stackBracket = new Stack<Character>();
        int sum = 1; int ans = 0; int index = 0;
        Boolean flag = true;

        String bracket = br.readLine();

        for (char c : bracket.toCharArray()) {
            if (c == '(') {
                stackBracket.push(c);
                sum *= 2; // sum 계산
            } 
            else if (c == '[') {
                stackBracket.push(c);
                sum *= 3; // sum 계산
            }
            else if (c == ')') {
                if (stackBracket.isEmpty() || stackBracket.peek() != '(') {
                    flag = false;
                    break;
                }
                else if (stackBracket.peek() == '(') {
                    stackBracket.pop();
                    if (bracket.charAt(index - 1) == '(') ans += sum; // ans 계산
                    sum /= 2; // ans 계산 후 sum 정리
                }
            }
            else if (c == ']') {
                if (stackBracket.isEmpty() || stackBracket.peek() != '[') {
                    flag = false;
                    break;
                }
                if (stackBracket.peek() == '[') {
                    stackBracket.pop();
                    if (bracket.charAt(index - 1) == '[') ans += sum; // ans 계산
                    sum /= 3; // ans 계산 후 sum 정리
                }
            }
            else { 
                flag = false;
                break;
            }
            index++;
        }

        if (!flag || !stackBracket.isEmpty()) { // 올바르지 못한 괄호열
            System.out.println(0);
            return;
        }

        System.out.println(ans);

        br.close();
    }
}