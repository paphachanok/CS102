import java.util.*;

public class Peak_element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	n = sc.nextInt();
		int[] arr = new int[n];
		int[] res = new int[n];
		int k = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n == 1) {
			System.out.print("1" + "\n" + arr[0]);
			return ;
		}
		for (int i = 0; i < n; i++) {
			if (i == 0 && arr[0] > arr[1]) {
				res[k] = arr[0];
				k++;
			}
			else if ((i >= 1 && i < n - 1) && (arr[i] > arr[i + 1] && arr[i] > arr[i - 1])){
				// System.out.print("=> " + arr[i] + " " + arr[i + 1] + " " + arr[i - 1]);
				res[k] = arr[i];
				k++;
			}
			else if (i == n - 1 && arr[i] > arr[i - 1]) {
				res[k] = arr[i];
				k++;
			}
		}
		System.out.println(k);
		for (int i = 0; i < k; i++) {
			System.out.print(res[i] + " ");
		}
	}
}
