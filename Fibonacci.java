import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	n = sc.nextInt();
		int	i = 1;

		while (n > 0)
		{
			System.out.print(Ft_fibo(i) + " ");
			n--;
			i++;
		}
		sc.close();

	}

	private static int Ft_fibo(int n) {
		int	result;

		result = 0;
		if (n == 1)
			return (0);
		if (n == 2)
			return (1);
		else
		{
			result = Ft_fibo(n - 1) + Ft_fibo(n - 2);
		}
		return (result);
	}

}
