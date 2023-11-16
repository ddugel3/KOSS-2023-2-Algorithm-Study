import java.io.*;

public class Matrix_add {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		
		int[][] matrix1 = new int[N][M];
		int[][] matrix2 = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String[] temp2 = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				matrix1[i][j] = Integer.parseInt(temp2[j]);
			}
		}
		
		for (int i = 0; i < N; i++) {
			String[] temp2 = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				matrix2[i][j] = Integer.parseInt(temp2[j]);
			}
		}
		int[][] result = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
				
				if (j == M - 1) {
					System.out.println(result[i][j]);
				}
				else {
					System.out.print(result[i][j] + " ");
				}
				
			}
		}
		
	}

}

