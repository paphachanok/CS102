import java.util.*;

public class p91_Round {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i1 = sc.nextDouble();
		sc.close();

		int num = (int)(Math.round(i1));
		if (num % 7 == 0 || num % 10 == 7) {
			System.out.println("Unlucky");
			return;
		}
		System.out.println("Lucky");
	}
}
