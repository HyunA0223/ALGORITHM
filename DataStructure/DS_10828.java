import java.util.Scanner;
import java.util.Stack;

public class DS_10828 {

   public static void main(String[] args) {
      Stack<Integer> stack = new Stack<Integer>();
      Scanner sc = new Scanner(System.in);
      int cnt = sc.nextInt();
  
      StringBuilder sb = new StringBuilder();
      
      for (int i = 0; i < cnt; i++) {
			String order = sc.next();
			
			if (order.equals("push")) {
				int num = sc.nextInt();
				stack.push(num);
			}
			else if (order.equals("pop")) {
				if (stack.empty()) 
					sb.append("-1").append("\n");
				else
					sb.append(stack.pop()).append("\n");
			}
			else if (order.equals("size")) 
				sb.append(stack.size()).append("\n");
			else if (order.equals("empty")) {
				if (stack.empty()) 
					sb.append("1").append("\n");
				else
					sb.append("0").append("\n");
			}
			else if (order.equals("top")) {
				if (stack.empty()) 
					sb.append("-1").append("\n");
				else
					sb.append(stack.peek()).append("\n");
			}
		}
      	System.out.println(sb);
      
      	sc.close();
   }
}