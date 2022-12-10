import java.util.Scanner;

public class Power_of_power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	input;
		int	result;
		int	i = 0;
		int arr[];
		long	ans[];
		int	count = 0;

		int	q = sc.nextInt();
		arr = new int[q * 3];
		ans = new long[q];

		while (i < q * 3) {
			input = sc.nextInt();
			arr[i] = input;
			i++;
		}
		i = 0;
		while (i < q)
		{
			int	a = arr[count];
			int	b = arr[count + 1];
			int	m = arr[count + 2];
			result = 1;
			while (b > 0)
			{
				result = result * a;
				b--;
			}
			result = result % m;
			//System.out.println(result);
			ans[i] = result;
			count += 3;
			i++;
		}
		for (i = 0; i < q; i++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}
