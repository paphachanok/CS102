import java.util.*;

public class Pattern_diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int row = 1; row <= num; row++) {
			pattern1(num, row);
			pattern2(num, row - 1);
			System.out.print("\n");
		}
		for (int row = 1; row <= num - 1; row++) {
			pattern3(num, row);
			pattern4(num, row);
			System.out.print("\n");
		}
		sc.close();
	}

	private static void pattern1(int num, int row) {
		for (int j = 1; j <= num; j++) {
			if ( j >= num - row + 1)
				System.out.print("*");
			else
				System.out.print("-");
		}
	}

	private static void pattern2(int num, int star) {
		for (int j = 1; j <= num - 1; j++) {
			if (j <= star) {
				System.out.print("*");
			}
			else
				System.out.print("-");
		}
	}

	private static void pattern3(int num, int row) {
		for (int j = 1; j <= num; j++) {
			if (j <= row)
				System.out.print("-");
			else
				System.out.print("*");
		}
	}

	private static void pattern4(int num, int row) {
		for (int j = 1; j <= num - 1; j++) {
			if (j <= num - row - 1)
				System.out.print("*");
			else
				System.out.print("-");
		}
	}
}
