
import java.util.Scanner;

public class Finite_state_machine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	i1 = sc.nextInt();
		int	i2 = sc.nextInt();
		String	i3 = sc.next();
		String	i4 = sc.next();

		// System.out.println(i1 + " " + i2);
		// System.out.println(i3 + " " + i4);
		if (i1 == 0 && i2 == 0) {
			if (i3.equals("-") && i4.equals("-"))
				System.out.println("NEUTRAL");
			else if (i3.equals("1") && i4.equals("-"))
				System.out.println("MuR");
			else if (i3.equals("-") && i4.equals("1"))
				System.out.println("DnD");
		}
		else if (i1 == 0 && i2 == 1) {
			if (i3.equals("-") && i4.equals("-"))
				System.out.println("DnD");
			else if (i3.equals("1") && i4.equals("-"))
				System.out.println("MuR");
			else if (i3.equals("-") && i4.equals("1"))
				System.out.println("DnD");
		}
		else if (i1 == 1 && i2 == 0) {
			if (i3.equals("-") && i4.equals("-"))
				System.out.println("MuR");
			else if (i3.equals("1") && i4.equals("-"))
				System.out.println("NEUTRAL");
			else if (i3.equals("-") && i4.equals("1"))
				System.out.println("DnD");
		}
		sc.close();
	}

}
