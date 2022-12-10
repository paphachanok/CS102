import java.util.*;

public class Wordsearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int	row = sc.nextInt();
		int	col = sc.nextInt();
		String[][]	chr = new String[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				chr[i][j] = sc.next();
			}
		}

		int	word_num = sc.nextInt();
		String[] arr_word = new String[word_num];
		for (int i = 0; i < word_num; i++) {
			arr_word[i] = sc.next();
		}
		sc.close();

		for (int count_word = 0; count_word < word_num; count_word++) {
			String word = arr_word[count_word];
			// System.out.println("count " + count_word + "  " + word);
			int	found = 0;
			for (int i = 0; i < row && found == 0; i++) {
				for (int j = 0; j < col && found == 0; j++) {
					// System.out.println("i: " + i + " j: " + j);
					String n = "";
					String ne = "";
					String e = "";
					String se = "";
					String s = "";
					String sw = "";
					String w = "";
					String nw = "";
					for (int jake = i; jake >= 0 && found == 0; jake--) {
						// System.out.println("i: " + i + " j: " + j);
						n += chr[jake][j];
						// System.out.println(n);
						if (n.equals(word)) {
							System.out.println(word + " found");
							found = 1;
							break;
						}
					}
					// System.out.println(n);
					for (int jake = i, tong = j; jake >= 0 && tong < col && found == 0; jake--, tong++) {
						ne += chr[jake][tong];
						if (ne.equals(word)) {
							System.out.println(word + " found");
							found = 1;
							break;
						}
					}
					for (int jake = j; jake < col && found == 0; jake++) {
						e += chr[i][jake];
						// if (i == 1 && j == 0)
						// 	System.out.print(e);
						if (e.equals(word)) {
							System.out.println(word + " found");
							found = 1;
							break;
						}
					}
					for (int jake = i, tong = j; jake < row && tong < col && found == 0; jake++, tong++) {
						se += chr[jake][tong];
						if (se.equals(word)) {
							System.out.println(word + " found");
							found = 1;
							break;
						}
					}
					for (int jake = i; jake < row && found == 0; jake++) {
						s += chr[jake][j];
						if (s.equals(word)) {
							System.out.println(word + " found");
							found = 1;
							break;
						}
					}
					for (int jake = i, tong = j; jake < row && tong >= 0 && found == 0; jake++, tong--) {
						sw += chr[jake][tong];
						if (sw.equals(word)) {
							System.out.println(word + " found");
							found = 1;
							break;
						}
					}
					for (int jake = j; jake >= 0 && found == 0; jake--) {
						w += chr[i][jake];
						if (w.equals(word)) {
							System.out.println(word + " found");
							found = 1;
							break;
						}
					}
					for (int jake = i, tong = j; jake >= 0 && tong >= 0 && found == 0; jake--, tong--) {
						nw += chr[jake][tong];
						if (nw.equals(word)) {
							System.out.println(word + " found");
							found = 1;
							break;
						}
					}
				}
			}
			if (found == 0)
				System.out.println(word + " not found");
		}
	}
}
