import java.util.*;

public class p92_SecondMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] arr = new double[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();
		Arrays.sort(arr);
		// for (int i = 0; i < num; i++) {
		// 	for (int j = i+1; j < num; j++) {
		// 		if (arr[i] > arr[j]) {
		// 			double tmp = arr[i];
		// 			arr[i] = arr[j];
		// 			arr[j] = tmp;
		// 		}
		// 	}
		// }
		System.out.printf("%.2f %.2f", arr[1], arr[num - 2]);
	}
}
