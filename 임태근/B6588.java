import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] notPrimeNumber = new boolean[1000001];
        notPrimeNumber[0] = true;
        notPrimeNumber[1] = true;
        for(int i = 2; i < 1000001; i++){
            if(!notPrimeNumber[i]){
                int j = 2;
                for(int k = i * 2; k < 1000001; k += i) notPrimeNumber[k] = true;
            }
        }
        boolean isWin = false;
        while(true){
           int cal = Integer.parseInt(br.readLine());
           if(cal == 0) break;
           for(int i = 2; i <= cal / 2; i++){
               if(!notPrimeNumber[i] && !notPrimeNumber[cal - i]){
                   isWin = true;
                   System.out.println(cal + " = " + i + " + " + (cal - i));
                   break;
               }
           }
           if(!isWin) System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}
