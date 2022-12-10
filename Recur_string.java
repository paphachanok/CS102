import java.util.*;

public class Recur_string {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		System.out.println(numString(4));
	}

	public static String numString(int n) {
		if (n == 0) {
			return "";
		}
		// return n + numString(n - 1);
		// return ft_repeat(n + numString(n - 1));
		return n + ft_repeat(numString(n - 1));
	}

	public static String ft_repeat(String i) {
		int time = Integer.parseInt(i);

		if (time == 0) {
			return "";
		}
		return time + ft_repeat(time - 1);
	}
}
