import java.util.*;

public class Sum_to_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();
		int i = 1;
		int res = 0;

		while (i <= num) {
			res = res + i;
			i++;
		}
		System.out.println(res);
	}
}
