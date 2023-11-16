package yjhleo1215;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class B1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), cnt = 1;
        int[][] times = new int[N][2];

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            times[i][0] = start;
            times[i][1] = end;
        }

        // arr을 가장 작은 수들이 맨 첨으로 가게 정렬하기..
        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
            }
        });

        int saveIndex = 0;
        for (int i = 1; i < N; i++) {
            int sstart = times[i][0];
            if (sstart >= times[saveIndex][1]) {
                cnt++;
                saveIndex = i;
            }
        }
        System.out.println(cnt);
    }
}
