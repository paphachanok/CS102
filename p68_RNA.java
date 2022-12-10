import java.util.*;

public class p68_RNA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String in = sc.next();
		String[] arr = new String[in.length() / 3];
		for (int i = 0; i < in.length(); i += 3) {
			arr[i / 3] = in.substring(i, i + 3);
		}

		int[] bag = new int[5];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("CUU") || arr[i].equals("CUC") || arr[i].equals("CUA") || arr[i].equals("CUG")) {
				bag[0]++;
			}
			else if (arr[i].equals("CCU") || arr[i].equals("CCC") || arr[i].equals("CCA") || arr[i].equals("CCG")) {
				bag[1]++;
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(bag[i] + " ");
		}

	}
}
