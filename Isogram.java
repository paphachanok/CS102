import java.util.Scanner;

public class Isogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] arr = new String[input.length()];

		for (int i = 0; i < input.length(); i++) {
			arr[i] = Character.toString(input.charAt(i));
			// System.out.println("=>" + arr[i]);
		}
		sc.close();
		for (int i = 0; i < input.length() - 2; i++) {
			for (int n = i + 1; n <= input.length() - 1; n++) {
				// System.out.println("arr[i]: " + arr[i] + "   arr[n]: " + arr[n]);
				if (arr[i].equals(" ") || arr[i].equals("-"))
					break;
				if (arr[i].equals(arr[n])) {
					System.out.println(input + " is not an isogram");
					return ;
				}
			}
			// if (arr[i].equals(" "))
			// 	System.out.print("here!");
		}
		System.out.println(input + " is an isogram");
		sc.close();
	}
}
