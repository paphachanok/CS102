import java.util.*;

public class p57_PartialSum1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int nq = sc.nextInt();
		for (int i = 0; i < nq; i++) {
			int i1 = sc.nextInt();
			int i2 = sc.nextInt();
			int sum = 0;
			for (int a = i1; a <= i2; a++) {
				sum += arr[a];
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
