package Baekjoon.b_1149;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int houseCnt = Integer.parseInt(br.readLine());
//        int[][] houseData = new int[houseCnt][3];
//        for(int i = 0; i < houseCnt; i++){
//            String[] temp = br.readLine().split(" ");
//            for(int j = 0; j < 3; j++) houseData[i][j] = Integer.parseInt(temp[j]);
//        }
//        long result = 0;
//        Integer[] tempData = new Integer[] {houseData[0][0] + Math.min(houseData[1][1], houseData[1][2]), houseData[0][1] + Math.min(houseData[1][0], houseData[1][2]), houseData[0][2] + Math.min(houseData[1][0], houseData[1][1])};
//        int idx = findMinIndex(tempData);
//        result += houseData[0][idx];
//        for(int i = 1; i < houseCnt - 1; i++){
//            List<Integer> list = new ArrayList<>();
//            for(int j = 0; j < 3; j++) if(j != idx) list.add(houseData[i][j] + returnMin(j, houseData[i + 1]));
//            int tempt = findMinIndex(list.toArray(new Integer[2]));
//            if(tempt >= idx) idx = tempt + 1;
//            else idx = tempt;
//            result += houseData[i][idx];
//        }
//        result += returnMin(idx, houseData[houseData.length - 1]);
//        System.out.println(result);
//    }
//    public static int findMinIndex(Integer[] param){
//        int idx = 0, min = param[0];
//        for(int i = 1; i < param.length; i++) {
//            if(min > param[i]){
//                idx = i;
//                min = param[i];
//            }
//        }
//        return idx;
//    }
//    public static int returnMin(int idx, int[] nextRow){
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < 3; i++) if(i != idx) list.add(nextRow[i]);
//        Collections.sort(list);
//        return list.get(0);
//    }
//}

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int houseCnt = scanner.nextInt();
        int[][] houseData = new int[houseCnt][3];
        for(int i = 0; i < houseCnt; i++) for(int j = 0; j < 3; j++) houseData[i][j] = scanner.nextInt();
        int[] dp = new int[3];
        for(int i = 0; i < 3; i++) dp[i] = houseData[0][i];
        for(int row = 1; row < houseCnt; row++){
            int[] temp = Arrays.copyOf(dp, dp.length);
            for(int i = 0; i < 3; i++){
                List<Integer> list = new ArrayList<>();
                for(int j = 0; j < 3; j++) if(i != j) list.add(temp[j]);
                Collections.sort(list);
                dp[i] = houseData[row][i] + list.get(0);
            }
        }
        int result = dp[0];
        for(int i = 1; i < 3; i++) if(result > dp[i]) result = dp[i];
        System.out.println(result);
    }

}
