import java.util.Scanner;

public class B1735 {
    public static int gcd(int num_1, int num_2) {
        if (num_2 == 0) return num_1;
        else return gcd(num_2, num_1 % num_2);
    }
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    int k = (a*d)+(b*c);
    int j = (b*d);
    

    int gcd;
    gcd = gcd(j,k);
    int A = k/gcd;
    int B = j/gcd;
    System.out.println(A+" "+B);
    

}
}