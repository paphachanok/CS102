import java.util.*;

public class p74_FullName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		sc.close();

		str = str.toLowerCase();
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] = (char)(arr[i] - 32);
			}
			if (arr[i] == ' ') {
				arr[i + 1] = (char)(arr[i + 1] - 32);
			}
		}
		System.out.println(arr);
	}
}
