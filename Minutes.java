//package java;
import java.util.Scanner;

public class Minutes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	mins = sc.nextInt();
		int	years = 0;
		int	days = 0;

		while (mins / 1440 > 0) {
			mins = mins - 1440;
			days++;
			//System.out.println(mins + " " + days + "\n");
			if (days == 365) {
				years++;
				days = 0;
				//System.out.println(years + " " + days + "\n");
			}
		}
		System.out.println(years + " " + days);
		sc.close();
	}
}
