package dasom040819;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B1874 {
    static Deque<Character> deque = new ArrayDeque<>();

    static void popDeque() {
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            System.out.print(deque.removeLast());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        boolean input_deque = true;
        char[] C = S.toCharArray();
        for (char str : C) {
            if (str == '<') {
                input_deque = false;
                popDeque();
                System.out.print(str);
            } else if (str == '>') {
                input_deque = true;
                System.out.print(str);
            } else if (str == ' ') {
                popDeque();
                System.out.print(" ");
            } else if (!input_deque) {
                System.out.print(str);
            } else {
                deque.add(str);
            }
        }
        popDeque();
        scan.close();
    }
}
