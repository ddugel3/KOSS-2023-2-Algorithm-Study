package dasom040819;
import java.util.Scanner;
//분수합
public class B1735 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Ac = scan.nextInt(), Ap = scan.nextInt();
        scan.nextLine();
        int Bc = scan.nextInt(), Bp = scan.nextInt();
        int max = 1;
        int solp = 0, solc = 0;
        for (int i = 2; i <= 30000; i++) {
            if ((Ap % i == 0) && (Bp % i == 0)) {
                max = i;
            } else if (max > Ap && max > Bp) {
                break;
            }
        }
        solp = Ap * Bp / max;
        solc = (solp / Ap) * Ac + (solp / Bp) * Bc;
        for (int i = 2; i <= 30000; i++) {
            if ((solp % i == 0) && (solc % i == 0)) {
                max = i;
            } else if (max > solp && max > solc) {
                break;
            }
        }
        solp = solp / max;
        solc = solc / max;

        System.out.printf("%d %d", solc, solp);
        scan.close();
    }
}
