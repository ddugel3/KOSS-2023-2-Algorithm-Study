import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> swapDeque = new ArrayDeque<>();
        String[] cal = br.readLine().split(" ");
        boolean turn = true;
        for(String each: cal){
            for(int i = 0; i < each.length(); i++){
                swapDeque.addLast(each.substring(i, i + 1));
                if(each.substring(i, i + 1).equals("<")){
                    turn = false;
                    int k = swapDeque.size();
                    swapDeque.pollLast();
                    for(int j = 0; j < k - 1; j++) System.out.print(swapDeque.pollLast());
                    swapDeque.clear();
                    swapDeque.addLast("<");
                } else if(each.substring(i, i + 1).equals(">")){
                    turn = true;
                    int k = swapDeque.size();
                    for(int j = 0; j < k; j++) System.out.print(swapDeque.pollFirst());
                    swapDeque.clear();
                }
            }
            while(!swapDeque.isEmpty()){
                if(turn) System.out.print(swapDeque.pollLast());
                else System.out.print(swapDeque.pollFirst());
            }
            System.out.print(" ");
        }


    }
}
