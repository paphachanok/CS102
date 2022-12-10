import java.util.*;

public class Airplane {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int[] input= new int[row * 2];
		int[] arr1 = new int[row];
		int[] arr2 = new int[row];
		int	sum1 = 0;
		int	sum2 = 0;

		for (int i = 0; i < (2 * row); i++) {
			input[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < (row * 2); i++) {
			sum1 = sum(arr1, row);
			sum2 = sum(arr2, row);
			int	found0;
			// System.out.println("sum => " + sum1 + " " + sum2);
			if (sum1 <= sum2) {
				found0 = 0;
				for (int n = 0; n < row; n++) { // วนหาที่ที่ยัง 0
					if (n == at_zero(arr1, row)) { //* only the first zero */
						arr1[n] = input[i];
						found0 = 1;
						break;
					}
				}
				if (found0 == 0) {
					//  create new 2 func; find lowest & rearest of the lowest
					for (int n = 0; n < row; n++) {
						int[] arr_tmp = arr1.clone();
						if (arr1[n] == lowest(arr1, row) && n == rearmost(arr1, lowest(arr_tmp, row), row)) {
							int int_tmp = arr1[n];
							arr1[n] = input[i];
							input[i] = int_tmp;
							arr2[at_zero(arr2, row)] = arr1[n];
						}
					}
				}
			}
			else {
				found0 = 0;
				for (int n = 0; n < row; n++) { // วนหาที่ที่ยัง 0
					if (n == at_zero(arr2, row)) { //* only the first zero */
						arr2[n] = input[i];
						found0 = 1;
						break;
					}
				}
				if (found0 == 0) {
					//  create new 2 func; find lowest & rearest of the lowest
					for (int n = 0; n < row; n++) {
						int[] arr_tmp = arr2.clone();
						if (arr1[n] == lowest(arr2, row) && n == rearmost(arr2, lowest(arr_tmp, row), row)) {
							int int_tmp = arr2[n];
							arr2[n] = input[i];
							input[i] = int_tmp;
							arr1[at_zero(arr2, row)] = arr2[n];
						}
					}
				}
			}
		}

		for (int i = 0; i < row; i++) {
			System.out.println(arr1[i] + " " + arr2[i]);
		}

		//* test lowest */
		// int[] arr = {2, 5, 10, 9, 6};
		// System.out.println(lowest(arr, 5));
		//* test rearmost */
		// int[] arr1 = {20, 5, 10, 5, 6};
		// int[] arr2 = {20, 5, 10, 5, 6};
		// System.out.println(rearmost(arr2, lowest(arr1, 5), 5));
		//* test at_zero */
		// int[] arr = {2, 3, 4, 0, 0};
		// System.out.println(at_zero(arr, 5));

	}

	private static int sum(int[] arr, int row) {
		int result = 0;
		for (int i = 0; i < row; i++) {
			result += arr[i];
		}
		return (result);
	}
	private static int lowest(int[] arr, int row) {
		for (int i = 0; i < row - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				int tmp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tmp;
			}
		}
		return (arr[row - 1]);
	}
	private static int rearmost(int[] arr, int lowest, int row) {
		int position = 0;
		for (int i = 0; i < row; i++) {
			if (arr[i] == lowest) {
				position = i;
			}
		}
		return (position);
	}
	private static int at_zero(int[] arr, int row) {
		// System.out.println("here's in func");
		// for (int s = 0; s < row; s++) {
		// 	System.out.println(arr[s]);
		// }
		for (int i = 0; i < row; i++) {
			if (arr[i] == 0) {
				// System.out.println("result: " + i);
				return (i);
			}
		}
		return (0);
	}

}
