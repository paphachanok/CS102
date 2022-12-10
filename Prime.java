import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	n = sc.nextInt();
		int	result = Ft(n);

		if (result == 0) {
			System.out.println("No");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

	private static int Ft(int	n) {
		int	i;

		i = 2;
		if (n == 2)
			return (1);
		else if (n > 2)
		{
			while (i < n)
			{
				if (n % i == 0)
					return (0);
				i++;
			}
			return (1);
		}
		return (0);
	}
}
