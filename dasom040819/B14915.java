package dasom040819;
import java.util.Scanner;
//진수변환기
public class B14915 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt(), N = scan.nextInt();

        scan.nextLine();
        scan.close();
        int sol = 0;
        String solution = "";
        while (true) {
            sol = M % N;
            M = M / N;
            switch (sol) {
                case 10:
                    solution = 'A' + solution;
                    break;
                case 11:
                    solution = 'B' + solution;
                    break;
                case 12:
                    solution = 'C' + solution;
                    break;
                case 13:
                    solution = 'D' + solution;
                    break;
                case 14:
                    solution = 'E' + solution;
                    break;
                case 15:
                    solution = 'F' + solution;
                    break;
                default:
                    solution = String.valueOf(sol) + solution;
                    break;

            }
            if (M == 0)
                break;
        }
        System.out.println(solution);
    }
}
