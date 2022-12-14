import java.util.*;

public class p81_Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			//char i2 = arr[arr.length - i];
			if (arr[i] != arr[arr.length - i - 1]) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
