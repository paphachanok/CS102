import java.util.*;

public class p59_Raining {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb = sc.nextInt();
		int[] arr = new int[nb];
		int day = sc.nextInt();

		for (int i = 0; i < day; i++) {
			int b1 = sc.nextInt() - 1;
			int b2 = sc.nextInt() - 1;

			for (int a = b1; a <= b2; a++) {
				arr[a]++;
			}
		}

		for (int i = 0; i < nb; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
