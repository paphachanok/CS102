import java.util.Scanner;

public class Weapon_facotory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	ingot = sc.nextInt();
		int	sword = 0;
		int	sheild = 0;
		int	helmet = 0;

		while (ingot >= 3) {
			if (ingot >= 10) {
				ingot -= 10;
				sword++;
			}
			if (ingot >= 8) {
				ingot -= 8;
				sheild++;
			}
			if (ingot >= 3) {
				ingot -= 3;
				helmet++;
			}
		}
		System.out.println(sword + " " + sheild + " " + helmet + " " + ingot);
		sc.close();

	}

}
