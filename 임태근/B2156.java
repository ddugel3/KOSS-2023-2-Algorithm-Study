import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] juice = new int[cnt];
        int[][] dp = new int[cnt][2];
        for(int i = 0; i < cnt; i++) juice[i] = Integer.parseInt(br.readLine());
        dp[0][0] = dp[0][1] = juice[0];
        int resultMax = juice[0];
        for(int i = 1; i < cnt; i++){
            int underMax = 0;
            if(i == 1) {
                dp[1][0] = juice[1];
                dp[1][1] = juice[0] + juice[1];
                resultMax = dp[1][1];
                continue;
            }
            for(int j = 0; j < i - 1; j++) underMax = Math.max(underMax, Math.max(dp[j][0], dp[j][1]));
            dp[i][0] = juice[i] + underMax;
            dp[i][1] = juice[i] + dp[i - 1][0];
            resultMax = Math.max(resultMax, Math.max(dp[i][0], dp[i][1]));
        }
        System.out.println(resultMax);
    }
}
