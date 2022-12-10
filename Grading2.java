import java.util.*;

public class Grading2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input1 = sc.nextInt();
		int[] input2 = new int[input1];
		int[] sorted = new int[input1];
		for (int i = 0; i < input1; i++) {
			input2[i] = sc.nextInt();
		}
		for (int i = 0; i <input1; i++) {
			sorted[i] = input2[i];
		}
		Arrays.sort(sorted);
		sc.close();

		// find each percentiles
		float[] grade = {90, 70, 50, 30, 10};
		int[] percen = new int[5];
		for (int i = 0; i < 5; i++) {
			grade[i] = ((grade[i] / 100) * (input1 + 1));
			percen[i] = sorted[Math.round(grade[i]) - 1];
			// System.out.println(percen[i]);
		}
		for (int i = 0; i < input1; i++) {
			if (input2[i] >= percen[0])
				System.out.print("A ");
			else if (input2[i] >= percen[1])
				System.out.print("B ");
			else if (input2[i] >= percen[2])
				System.out.print("C ");
			else if (input2[i] >= percen[3])
				System.out.print("D ");
			else if (input2[i] >= percen[4])
				System.out.print("E ");
			else
				System.out.print("F ");
		}
	}
}
