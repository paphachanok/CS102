import java.util.Scanner;

public class Bacteria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	n = sc.nextInt();
		int	bac_num = 0;

		while (n > 0)
		{
			if (n % 2 == 0)
			{
				n = n / 2;
			}
			else if (n % 2 == 1)
			{
				n = n - 1;
				bac_num += 1;
			}
		}
		System.out.println(bac_num);
		sc.close();
	}
}
