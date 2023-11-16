package yjhleo1215;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
public class B1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> printList = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        boolean m = true, answer = true;
        int n = sc.nextInt(), num, pushSave = 1;
        for (int i=0; i<n; i++) {
            num = sc.nextInt();
            sc.nextLine();

            if (m == false && num == st.peek()) {
                st.pop();
                printList.add('-');
                continue;
            }else if (m == false && num != st.peek()) {
                answer = false;
            }

            if (m && pushSave <= num) {
                for (int j=pushSave; j<=num; j++) {
                    st.push(j);
                    printList.add('+');
                }
                pushSave = num+1;
            }

            if (num == n) {
                m = false;
            }



            if (num == st.peek()) {
                st.pop();
                printList.add('-');
            }

        }


        if (answer) {
            for (char i : printList) {
                System.out.println(i);
            }
        }else {
            System.out.println("NO");
        }
    }
}
