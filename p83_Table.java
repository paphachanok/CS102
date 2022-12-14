import java.util.*;

public class p83_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		for (int i = 1; i <= r + 1; i++) {
			if (i == 1) {
				for (int j = 1; j <= c; j++) {
					if (j == 1) {
						System.out.print("*_*");
					}
					else
						System.out.print("_*");
				}
			}
			else {
				for (int j = 1; j <= c; j++) {
					if (j == 1) {
						System.out.print("|_|");
					}
					else
						System.out.print("_|");
				}
			}
			System.out.print("\n");
		}
	}
}
