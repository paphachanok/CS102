import java.util.*;

public class p95_Avg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		double[][] arr = new double[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
		sc.close();

		System.out.println("Average of each row:");
		for (int i = 0; i < r; i++) {
			double res = 0;
			for (int j = 0; j < c; j++) {
				res += arr[i][j];
			}
			System.out.printf("%.2f ", res/c);
		}

		System.out.println("\nAverage of each column:");
		for (int i = 0; i < c; i++) {
			double res = 0;
			for (int j = 0; j < r; j++) {
				res += arr[j][i];
			}
			System.out.printf("%.2f ", res/r);
		}
	}
}
