import java.util.*;

public class p77_CoinChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();


		if (i1 > i2) {
			System.out.println("Not enough money.");
		}
		else if (i1 == i2) {
			System.out.println("No change for you.");
		}
		else {
			int num = i2 - i1;
			System.out.println("Change: " + num);
			int[] arr = {1000, 500, 100, 50, 20, 10, 5, 2, 1};

			for (int i = 0; i < 9; i++) {
				if (num / arr[i] == 0) {
					System.out.println(arr[i] + "THB: 0");
				}
				else {
					System.out.println(arr[i] + "THB: " + (num / arr[i]));
					num = num - ((num / arr[i]) * arr[i]);
				}
			}
		}
		// else {
		// 	int num = i2 - i1;
		// 	// int res = 0;
		// 	System.out.println("Change: " + num);
		// 	if (num / 1000 == 0) {
		// 		System.out.println("1000THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("1000THB: " + (num / 1000));
		// 		num = num - ((num / 1000) * 1000);
		// 	}
		// 	if (num / 500 == 0) {
		// 		System.out.println("500THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("500THB: " + (num / 500));
		// 		num = num - ((num / 500) * 500);
		// 	}
		// 	if (num / 100 == 0) {
		// 		System.out.println("100THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("100THB: " + (num / 100));
		// 		num = num - ((num / 100) * 100);
		// 	}
		// 	if (num / 50 == 0) {
		// 		System.out.println("50THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("50THB: " + (num / 50));
		// 		num = num - ((num / 50) * 50);
		// 	}
		// 	if (num / 20 == 0) {
		// 		System.out.println("20THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("20THB: " + (num / 20));
		// 		num = num - ((num / 20) * 20);

		// 	}
		// 	if (num / 10 == 0) {
		// 		System.out.println("10THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("10THB: " + (num / 10));
		// 		num = num - ((num / 10) * 10);

		// 	}
		// 	if (num / 5 == 0) {
		// 		System.out.println("5THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("5THB: " + (num / 5));
		// 		num = num - ((num / 5) * 5);
		// 	}
		// 	if (num / 2 == 0) {
		// 		System.out.println("2THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("2THB: " + (num / 2));
		// 		num = num - ((num / 2) * 2);

		// 	}
		// 	if (num / 1 == 0) {
		// 		System.out.println("1THB: 0");
		// 	}
		// 	else {
		// 		System.out.println("1THB: " + num);
		// 		num = num - ((num / 1) * 1);
		// 	}
		// }
	}
}
