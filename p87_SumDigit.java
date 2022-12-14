import java.util.*;

public class p87_SumDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(recur(num));
		sc.close();

	}

	private static int recur(int num) {
		if (num == 0) {
			return (0);
		}
		return (num % 10) + recur(num / 10);
	}
}
