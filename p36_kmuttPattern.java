import java.util.*;

public class p36_kmuttPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int row = (i * 2) + (i - 1) + 2;
		int col = ((i + 1) * 2) + (i - 1);

		for (int r = 1; r <= row; r++) {
			if (r <= i) {
				for (int c = 1; c <= col; c++) {
					if (c == i + 1)
						System.out.print("*");
					else
						System.out.print("-");
				}
			}
			else if (r == i + 1) {
				for (int c = 1; c <= col; c++) {
					if (c <= col - i)
						System.out.print("*");
					else
						System.out.print("-");
				}
			}
			else if (r == row - i) {
				for (int c = 1; c <= col; c++) {
					if (c > i)
						System.out.print("*");
					else
						System.out.print("-");
				}
			}
			else if (r == i + 1) {
				for (int c = 1; c <= col; c++) {
					if (c <= col - i)
						System.out.print("*");
					else
						System.out.print("-");
				}
			}
			else if (r >= row - i) {
				for (int c = 1; c <= col; c++) {
					if (c == col - i)
						System.out.print("*");
					else
						System.out.print("-");
				}
			}
			else {
				for (int c = 1; c <= col; c++) {
					if (c == i + 1 || c == col - i)
						System.out.print("*");
					else
						System.out.print("-");
				}
			}
			System.out.print("\n");
		}
	}
}
