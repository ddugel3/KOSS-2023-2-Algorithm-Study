import java.io.*;

public class Matrix_mul {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			int r = Integer.parseInt(temp[0]);
			int s = Integer.parseInt(temp[1]);
			int t = Integer.parseInt(temp[2]);
			
			int[][] matrix1 = new int[r][s];
			int[][] matrix2 = new int[s][t];
			
			for (int j = 0; j < r; j++) {
				String[] temp2 = br.readLine().split(" ");
				for (int k = 0; k < s; k++) {
					matrix1[j][k] = Integer.parseInt(temp2[k]);
				}
			}
			
			for (int j = 0; j < s; j++) {
				String[] temp2 = br.readLine().split(" ");
				for (int k = 0; k < t; k++) {
					matrix2[j][k] = Integer.parseInt(temp2[k]);
				}
			}
			
			int[][] result = new int[r][t];
			
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < t; k++) {
					for (int l = 0; l < s; l++) {
						result[j][k] = result[j][k] + (matrix1[j][l] * matrix2[l][k]);
					}
				}
			}
			
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < t; k++) {
					if (k == t - 1) {
						System.out.println(result[j][k]);
					}
					else {
						System.out.print(result[j][k] + " ");
					}
				}
			}
		}
	}

}