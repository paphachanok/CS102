import java.util.*;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int[] rev_arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int tmp = num;
		for (int i = 0; i < num; i++) {
			rev_arr[i] = arr[tmp - 1];
			tmp--;
		}
		// System.out.println(num / 2);
		// for (int i = 0; i < num; i++) {
		// 	System.out.println(rev_arr[i]);
		// }
		for (int i = 0; i <= num / 2; i++) {
			System.out.print(rev_arr[i] + " ");
			if (num % 2 == 0) {
				if (i <= (num / 2) - 2)
					System.out.print(arr[i] + " ");
			}
			else {
				if (i <= (num / 2) - 1)
					System.out.print(arr[i] + " ");
			}
		}
	}
}
