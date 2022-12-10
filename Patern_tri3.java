import java.util.*;

public class Patern_tri3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		sc.close();
		int i = 1;
		int col;

		while (i <= row) {
			col = 1;
			while (col <= row) {
				if (col >= row - i + 1) {
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
