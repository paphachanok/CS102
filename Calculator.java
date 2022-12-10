import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	i1 = sc.nextInt();
		// String	o = sc.nextLine();
		char	opper = sc.next().charAt(0);
		int i2 = sc.nextInt();

		switch (opper) {
			case '+':
				System.out.println(i1 + i2); break;
			case '-':
				System.out.println(i1 - i2); break;
			case '*':
				System.out.println(i1 * i2); break;
			case '/':
				System.out.println(i1 / i2); break;
			case '%':
				System.out.println(i1 % i2); break;
			default:
				System.out.println("error");
		}
		sc.close();
	}
}
