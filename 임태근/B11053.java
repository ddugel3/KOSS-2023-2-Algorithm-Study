import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] cal = new int[len];
        int[] dpResult = new int[len];
        Arrays.fill(dpResult, 1);
        for(int i = 0; i < len; i++) cal[i] = scanner.nextInt();
        for(int i = 0; i < len; i++) for(int j = 0; j < i; j++) if(cal[i] > cal[j]) dpResult[i] = Math.max(dpResult[i], dpResult[j] + 1);
        Arrays.sort(dpResult);
        System.out.println(dpResult[dpResult.length - 1]);
    }
}
