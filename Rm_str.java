import java.util.Scanner;

public class Rm_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String i1 = sc.nextLine();
		String i2 = sc.nextLine();
		if (i1.length() < i2.length()) {
			System.out.println(i2.replace(i1, ""));
		}
		else if (i2.length() < i1.length()) {
			System.out.println(i1.replace(i2, ""));
		}
		sc.close();

	}
}
