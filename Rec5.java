import java.util.*;

public class Rec5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || i == num)
					System.out.print("*");
				else if (j == 1 || j == num)
					System.out.print("*");
				else if (j == i || j == num - i + 1)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.print("\n");
		}
	}
}
