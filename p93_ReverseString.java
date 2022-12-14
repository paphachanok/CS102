import java.util.*;

public class p93_ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			String str = sc.next().toLowerCase();
			for (int j = str.length() - 1; j >= 0; j--) {
				if (j == str.length() - 1) {
					System.out.print(str.substring(j).toUpperCase());
				}
				else {
					System.out.print(str.charAt(j));
				}
			}
			System.out.print(" ");
		}
		sc.close();
	}
}
