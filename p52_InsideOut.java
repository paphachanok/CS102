import java.util.*;

public class p52_InsideOut {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = (str.length() / 2) - 1;
		sc.close();
        for (int i = len; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        if (str.length() % 2 == 1) {
            System.out.print(str.charAt(str.length() / 2));
            for (int i = str.length() - 1; i > len + 1; i--) {
                System.out.print(str.charAt(i));
            }
            return;
        }

        for (int i = str.length() - 1; i > len; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
