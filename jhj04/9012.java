import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {

            System.out.println(S(in.next()));
        }
    }

    public static String S(String a) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);

            if (b == '(') {
                stack.push(b);
            } else if (stack.isEmpty()) {
                return ("NO");
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return ("YES");
        }
        else{
            return("NO");
        }
    }
}
