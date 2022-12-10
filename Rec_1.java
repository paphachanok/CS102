import java.util.Scanner;

public class Rec_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	n = sc.nextInt();
		int	row;
		int	col;

		row = n;
		while (row > 0)
		{
			col = n;
			while (col > 0)
			{
				System.out.print("*");
				col--;
			}
			System.out.print("\n");
			row--;
		}
		sc.close();

	}
}
