import java.util.Scanner;

public class Matching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String i1 = sc.next();
		String i2 = sc.next();
		if (i1.contentEquals(i2)) {
			System.out.print("Perfect Match");
		} else if (i1.compareToIgnoreCase(i2) == 0) {
			System.out.println("Partial Match");
		} else if (i1.length() < i2.length() && i2.contains(i1)) {
			System.out.println("Partial Match");
		} else if (i2.length() < i1.length() && i1.contains(i2)) {
			System.out.println("Partial Match");
		} else {
			System.out.println("Not Match");
		}
		sc.close();
	}
}
