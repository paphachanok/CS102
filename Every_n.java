import java.util.Scanner;

public class Every_n {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);

		String str = sc.nextLine();
		String[] arr = new String[str.length()];
		int num = sc.nextInt();
		int len = str.length();

		for (int i = 0; i < len; i++) {
			arr[i] = Character.toString(str.charAt(i));
		}
		for (int i = 0; i < len; i++) {
			if (i % num == 0) {
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}
}
