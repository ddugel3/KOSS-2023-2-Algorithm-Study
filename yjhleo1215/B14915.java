package yjhleo1215;

import java.util.Scanner;
import java.util.ArrayList;
public class B14915 {
    public static void main(String[] args) {
        char[] num = new char[6];
        for (int i=0; i < 6; i++) {
            int k = i+65;
            num[i] = (char) k;
        }

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        ArrayList<Integer> Jin = new ArrayList<>();
        while (m >= n) {
            Jin.add(m%n);
            m/=n;
        }
        Jin.add(m);

        for (int i = Jin.size()-1; i>=0; i--) {
            if (Jin.get(i) >= 10) {
                System.out.print(num[Jin.get(i)-10]);
            }else System.out.print(Jin.get(i));
        }
    }
}

