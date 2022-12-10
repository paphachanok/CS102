import java.util.Scanner;

public class Train_bomb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	num = sc.nextInt();
		int	bomb = sc.nextInt();
		if (num <= 3) {
			System.out.println("DIE");
		} else {
			for (int i = 1; i <= num; i++) {
				if (i == bomb - 1 || i == bomb || i == bomb + 1) {
					continue;
				}
				System.out.print(i + " ");
			}
		}
		sc.close();

	}
}
