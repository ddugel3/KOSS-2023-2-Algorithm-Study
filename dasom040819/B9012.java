package dasom040819;

import java.util.Scanner;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String input;

        for (int t = 0; t < T; t++) {
            Stack<Character> stack = new Stack<>();
            input = scan.next();

            for (int i = 0; i < input.length(); i++) {
                char a = input.charAt(i);
                if (stack.isEmpty() && a == ')') {
                    stack.push(a);
                    break;
                }
                if (a == '(') {
                    stack.push(a);
                } else if (a == ')' && !stack.isEmpty()) {
                    stack.pop();
                }

            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}
