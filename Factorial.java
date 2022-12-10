import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();
		if (num >= 1 && num <= 20) {
			System.out.println(ft_fac(num));
		}
		sc.close();
	}

	private static long ft_fac(long num) {
		if (num == 1)
			return (1);
		num = num * ft_fac(num - 1);
		return (num);
	}
}
