import java.util.*;

public class Transpose_matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int col = sc.nextInt();
		int row = sc.nextInt();
		int[][] arr = new int[row][col];
		int[][] new_arr = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				new_arr[i][j] = arr[j][i];
			}
		}
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(new_arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
