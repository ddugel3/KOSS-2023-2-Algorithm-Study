import java.util.Scanner;

public class B2609 {
    public static int gcd(int num_1, int num_2) {
        if (num_2 == 0) return num_1;
        else return gcd(num_2, num_1 % num_2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd;

        if (a > b) {
            gcd = gcd(a, b);
        } else {
            gcd = gcd(b, a);
        }

        System.out.println(gcd);
        System.out.println((a * b) / gcd);
    }
}
