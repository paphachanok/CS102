import java.util.*;

public class Pattern_tri2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
			num--;
		}
		sc.close();
	}
}
