import java.util.*;

public class p68_Neon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String big_arr[] = new String[num];
		for (int i = 0; i < num; i++) {
			big_arr[i] = sc.next();
		}

		int len = big_arr[0].length();
		char[][] arr = new char[num] [len];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < len; j++) {
				arr[i][j] = big_arr[i].charAt(j);
			}
		}
		for (int j = 0; j < len; j++) {
			for (int i = 0; i < num; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
