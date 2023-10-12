import java.util.Scanner;

public class B14915 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_dec = in.nextInt();
        int BASE = in.nextInt();
        String num_bin = "";
        char[] Num = {'A', 'B', 'C', 'D', 'E', 'F'};
        
        if (num_dec == 0) { 
            num_bin = "0";
        } else {
            while (num_dec > 0) {
                int remainder = num_dec % BASE;
                if (remainder >= 10) {
                    char h = Num[remainder - 10];
                    num_bin = h + num_bin;
                } else {
                    num_bin = remainder + num_bin;
                }
                num_dec = num_dec / BASE;
            }
        }
        
        System.out.println(num_bin);
    }
}