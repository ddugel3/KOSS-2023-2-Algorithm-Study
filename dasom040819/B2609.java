package dasom040819;
import java.util.Scanner;
//최대공약수 최소공배수
public class B2609 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        scan.nextLine();
        int max = 1, min = 0;

        for (int i = 2; i <= 10000; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                max = i;
            } else if (max > a && max > b) {
                break;
            }
        }

        min = a * b / max;
        System.out.printf("%d\n%d", max, min);
        scan.close();

    }
}
