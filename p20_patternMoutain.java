import java.util.*;

public class p20_patternMoutain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int[] new1 = new int[num];
		new1 = arr.clone();
		Arrays.sort(new1);

		int[] new2 = new int[num];
		new2 = arr.clone();
		for (int i = 0; i < num; i++) {
			new2[i] += new2[i] - 1;
		}

		int row = new1[num - 1];
		int col = 0;
		for (int i = 0; i < num; i++) {
			col += new2[i];
		}

		char[][] big = new char[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				big[i][j] = '-';
			}
		}
		int tmp2 = 0;
		for (int k = 0; k < num; k++) {
			int tmp = arr[k];
			int count = 0;

			for (int i = row - 1; i >= row - tmp; i--) {  // 3 floor
				int tmp3 = tmp2 + (tmp + tmp - 1);  // longest col of each floor, each mountain

				for (int j = tmp2 + count; j < tmp3 - count; j++) {  // column
						big[i][j] = '*';
				}
				count++;
			}
			tmp2 += arr[k] + arr[k] - 1;  // logest of previous moutain
		}


		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(big[i][j]);
			}
			System.out.println();
		}
	}
}
