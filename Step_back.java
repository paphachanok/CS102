import java.util.Scanner;

public class Step_back {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i1 = sc.nextInt();
		int i2 = sc.nextInt();

		if (i1 < i2) {
			int tmp;
			tmp = i1;
			i1 = i2;
			i2 = tmp;
		}
		// int times = i1 - i2 + 1;
		int num_const = i1;
		int num = i1;
		int m1 = 1;
		int m2 = 1;
		while (i1 >= i2) {
			num = num_const;
			while (m1 > 0) {
				System.out.print(num + " ");
				num--;
				m1--;
			}
			m2++;
			m1 = m2;
			i1--;
		}
		sc.close();
	}
}
