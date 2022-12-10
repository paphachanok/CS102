import java.util.Scanner;

public class JohnWick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String day = sc.nextLine();
		switch (day) {
			case ("Monday"):
				System.out.println("Fortune: Purple" + "\n" + "Unfortunate : Red"); break;
			case ("Tuesday"):
				System.out.println("Fortune: Orange" + "\n" + "Unfortunate : Yellow, White"); break;
			case ("Wednesday"):
				System.out.println("Fortune: Black, Brown, Gray" + "\n" + "Unfortunate : Pink"); break;
			case ("Thursday"):
				System.out.println("Fortune: Red" + "\n" + "Unfortunate : Purple"); break;
			case ("Friday"):
				System.out.println("Fortune: Pink" + "\n" + "Unfortunate : Black, Blue, Gray"); break;
			case ("Saturday"):
				System.out.println("Fortune: Blue, Baby Blue" + "\n" + "Unfortunate : Green"); break;
			case ("Sunday"):
				System.out.println("Fortune: Green" + "\n" + "Unfortunate : Blue, Baby Blue"); break;
			default:
				System.out.println("Input is invalid");
		}
		sc.close();
	}
}
