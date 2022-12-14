import java.util.*;

public class p79_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] arr = new double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();

		double sum = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		System.out.print("Summation: ");
		System.out.printf("%.2f\n", sum);
		System.out.print("Average: ");
		System.out.printf("%.2f\n", (sum / n));
		System.out.print("Max: ");
		System.out.printf("%.2f\n", arr[n - 1]);
		System.out.print("Min: ");
		System.out.printf("%.2f\n", arr[0]);


	}
}
