package yjhleo1215;

import java.util.ArrayList;
import java.util.Scanner;

public class B10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int k = sc.nextInt(), answer = 0, n = 0;
        for (int i=0; i<k; i++) {
            n = sc.nextInt();
            if (n == 0 && i == 0) {
                continue;
            } else if (n == 0 && i != 0) {
                numList.remove(numList.size()-1);
            } else {
                numList.add(n);
            }
        }
        for (int i : numList) answer += i;
        System.out.println(answer);
    }
}