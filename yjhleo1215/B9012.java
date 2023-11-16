package yjhleo1215;

import java.util.Scanner;
import java.util.Stack;


public class B9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<T; i++) {
            String PS = sc.nextLine();
            Stack<Integer> stack = new Stack<>();
            if (PS.length() % 2 == 1) {
                System.out.println("NO");
            }else {
                for (int j=0; j<PS.length(); j++) {
                    if (PS.charAt(j) == '(') {
                        stack.push(1);
                    }else if (PS.charAt(j) == ')' && !stack.empty()) {
                        stack.pop();
                    }else {
                        System.out.println("NO");
                        break;
                    }
                    if (j == PS.length()-1) {
                        if (stack.empty()) {
                            System.out.println("YES");
                        }else {
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
    }
}
