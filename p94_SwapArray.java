import java.util.*;

public class p94_SwapArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] arr = new double[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();

		Arrays.sort(arr);
		for (int i = 0; i < num; i++) {
			if (i < num/2 && i % 2 == 0) {
				double tmp = arr[i];
				arr[i] = arr[num - i - 1];
				arr[num - i - 1] = tmp;
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.printf("%.2f ", arr[i]);
		}

	}
}
