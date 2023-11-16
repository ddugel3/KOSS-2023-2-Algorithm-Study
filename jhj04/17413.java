import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Stack<Character> st = new Stack<Character>();
        int tag = 0;  // tag 안이면 1 밖이면 0
        String input = in.nextLine();
        StringBuilder sb = new StringBuilder();

        for(char c : input.toCharArray()) {
            if(c == '<') { // tag 밖에서 < 마주쳤을 때
                tag += 1; // 이제 tag 안
                while(!st.isEmpty()) {
                    sb.append(st.pop()); // 그 전에 있는거 append해서 비워주기
                }
                sb.append("<");
            } else if(c == '>') { // >을 마주쳤을 때, 
                tag -= 1; // 이제 tag 밖
                sb.append(">");
            } else if(c == ' ') {
                while(!st.isEmpty())
                    sb.append(st.pop()); // 공백 전까지 거꾸로 출력
                sb.append(" ");
            } else {
                if(tag == 0) // tag 밖
                    st.push(c); //안에 넣어주기
                else // 태그 안이면 그대로 출력.
                    sb.append(c);
            }
        }

        // 스택에 남은 것 처리
        while(!st.isEmpty())
            sb.append(st.pop());

        System.out.println(sb);
    }
}
