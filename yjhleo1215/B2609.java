package yjhleo1215;

import java.util.ArrayList;
import java.util.Scanner;

public class B2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> yak = new ArrayList<>();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N;

        if (A>B) {
            N = A;
        }else N = B;

        for (int i = 1; i <= N; i++) {
            if (A%i == 0 && B%i == 0) {
                yak.add(i);
            }
        }

        System.out.println(Max(yak));
        System.out.println(A*B / Max(yak));
    }
    private static int Max(ArrayList<Integer> yak) {
        int maxInt = 0;
        for (int yakSoo : yak) {
            if (yakSoo > maxInt) maxInt = yakSoo;
        }
        return maxInt;
    }
}