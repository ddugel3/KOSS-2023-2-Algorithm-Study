import java.io.*;

public class B25501 {
	static long count = 0;
	static boolean isPal = true;
	
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String S = br.readLine();
			System.out.println(isPalindrome(S) + " " + count);
			count = 0;
			isPal = true;
		}

	}

	public static int recursion(String s, int l, int r){
		if (isPal != false) {
    		count++;
    	}
		
		if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) {
        	isPal = false;
        	return 0;
        }
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}