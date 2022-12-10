import java.util.Scanner;

public class Pattern_tri4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		sc.close();
		int i = 1;
		int col;
		while (i <= row) {
			col = 1;
			while (col <= row) {
				if (col >= i) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
				col++;
			}
			System.out.print("\n");
			i++;
		}
	}
}
