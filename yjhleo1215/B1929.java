package yjhleo1215;

import java.util.Scanner;

public class B1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();
        for (int i = M; i <= N; i++){
            int count = 0;
            for (int j = 1; j < Math.pow(i, 0.5); j++) {
                if (i%j == 0) count++;
            }
            if (count == 1) System.out.println(i);
        }
    }
}
// 시간 초과 뜨면서 실패해요!!