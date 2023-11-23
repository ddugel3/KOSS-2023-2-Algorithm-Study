package dasom040819;
import java.util.Scanner;
//소수구하기
public class B1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt(), N = scan.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= N; i++) {

            if (arr[i] == 0)
                continue;

            for (int j = i * 2; j <= N; j += i) {
                arr[j] = 0;
            }
        }
        scan.close();
        for (int i = M; i <= N; i++) {
            if (arr[i] != 0)
                System.out.println(arr[i]);
        }
    }
}
