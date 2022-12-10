import java.util.Scanner;

public class WhereRU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String str_low = str.toLowerCase();
		String str_up = str.toUpperCase();

		int i;
		char c = sc.nextLine().charAt(0);
		int len = str.length();

		int	ans[] = new int[len];
		int ans_i = 0;
		int count = 0;

		for (i = 0; i < len; i++) {
			if (str.charAt(i) == c || str_low.charAt(i) == c || str_up.charAt(i) == c) {
				count++;
				//System.out.println("num: " + ans_i);
				ans[ans_i] = i;
				//System.out.println("arr: " + ans[ans_i]);
				ans_i++;
			}
		}
		if (count == 0) {
			System.out.println("ERROR");
		} else {
			System.out.println(count);
			for (int n = 0; n < ans_i; n++) {
				System.out.print(ans[n]);
				if (n != ans_i - 1) {
					System.out.print(", ");
				}
			}
		}
		sc.close();

	}
}
