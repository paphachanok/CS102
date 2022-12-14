import java.util.*;

public class p49_Isogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		String nstr = str.toLowerCase();
		char[] arr = nstr.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if ((int)arr[i] == (int)arr[j]) {
					System.out.print(str);
					System.out.print(" is not an isogram");
					return;
				}
			}
		}
		System.out.print(str);
		System.out.print(" is an isogram");
	}
}
