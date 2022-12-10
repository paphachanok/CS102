import java.util.*;

public class Coins {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] strr = str.split(" ");
		double[] arr = new double[strr.length];
		double sum = 0;

		for (int i = 0; i < strr.length; i++) {
			arr[i] = Double.valueOf(strr[i]);
			sum += arr[i];
		}
		double medd = (sum / (arr.length));
		long med = Math.round(medd);
		int diff = 0;
		for (int i = 0; i < strr.length; i++) {
			diff += Math.abs(med - arr[i]);
		}
		System.out.println(diff);

	}
}
