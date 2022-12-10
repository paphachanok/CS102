import java.util.Scanner;

public class Pattern_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		for (int n = 1; n <= row; n++) {
			for (int m = 1; m <= n; m++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
