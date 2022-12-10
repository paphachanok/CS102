import java.util.Scanner;

public class Sum_alpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int len = str.length();
		int result = 0;

		for (int i = 0; i < len; i++) {
			char c_chr = str.charAt(i);
			int c_int = (int) c_chr;
			// System.out.println(c_int);
			if (c_int >= 65 && c_int <= 90) {
				c_int = c_int - 64 - i;
			} else if (c_int >= 97 && c_int <= 122) {
				c_int = c_int - 96 - i;
			} else {
				continue;
			}
			// System.out.println("c_int: " + c_int);
			result += c_int;
			// System.out.println("result: " + result);
		}
		System.out.println(result);
		sc.close();

	}
}
