import java.util.*;

public class Encrypt_code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char[] arr = new char[str.length()];
		char[] res = new char[str.length()];
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {
			res[i] = '*';
		}
		// for (int i = 0; i < str.length(); i++) {
		// 	System.out.println(arr[i]);
		// }
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (arr[i] == (arr[j])) {
					res[i] = '-';
					res[j] = '-';
				}
			}
		}
		for (int i = 0; i < str.length(); i++) {
			System.out.print(res[i]);
		}
	}
}
