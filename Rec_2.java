import java.util.Scanner;

public class Rec_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	row = sc.nextInt();
		int col = sc.nextInt();
		int	temp_col;

		while (row > 0)
		{
			temp_col = col;
			while (temp_col > 0)
			{
				System.out.print("*");
				temp_col--;
			}
			System.out.print("\n");
			row--;
		}
		sc.close();

	}
}
