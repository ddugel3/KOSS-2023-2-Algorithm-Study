package yjhleo1215;

import java.util.Scanner;

public class B1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sonA = sc.nextInt();
        int momA = sc.nextInt();
        int sonB = sc.nextInt();
        int momB = sc.nextInt();
        sc.close();
        int mom = momA*momB;
        int son = sonA*momB + sonB*momA;
        int gCd = GCD(mom, son);
        System.out.println(son/gCd+" "+mom/gCd);
    }

    private static int GCD(int mom, int son) {
        int gcd = 0;
        int N;
        if (mom > son) {
            N = mom;
        }else N = son;
        for (int i = 1; i <= N; i++) {
            if (mom%i == 0 && son%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}