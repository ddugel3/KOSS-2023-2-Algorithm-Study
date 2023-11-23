import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1929 {
    public static List<Integer> findPrimes(int m, int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] sieve = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        for (int j = m; j <= n; j++) {
            if (sieve[j]) {
                primes.add(j);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        List<Integer> primes = findPrimes(m, n);

        for (int prime : primes) {
            System.out.println(prime);
        }
    }
}