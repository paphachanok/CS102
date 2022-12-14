import java.util.*;

public class p82_MorseCode2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		String res = "";

		for (int i = 0; i < arr.length; i++) {
			res += ft(arr[i]);
		}
		System.out.println(res);
		sc.close();
	}

	private static String ft(String str) {
		switch (str) {
			case ".-" : return "A";
			case "-..." : return "B";
			case "-.-." : return "C";
			case "-.." : return "D";
			case "." : return "E";
			case "..-.": return "F";
			case "--.": return "G";
			case "....": return "H";
			case "..": return "I";
			case ".---": return "J";
			case "-.-": return "K";
			case ".-..": return "L";
			case "--": return "M";
			case "-.": return "N";
			case "---": return "O";
			case ".--.": return "P";
			case "--.-": return "Q";
			case ".-.": return "R";
			case "...": return "S";
			case "-": return "T";
			case "..-": return "U";
			case "...-": return "V";
			case ".--": return "W";
			case "-..-": return "X";
			case "-.--": return "Y";
			case "--..": return "Z";
		}
		return "";
	}
}
