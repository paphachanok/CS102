import java.util.*;

public class p86_Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		System.out.println(recur(i1, i2));
		sc.close();

	}

	private static int recur(int i1, int i2) {
		if (i2 == 0) {
			return 0;
		}
		return i1 + recur(i1, i2 - 1);
	}
}
