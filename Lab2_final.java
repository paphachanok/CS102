import java.util.Scanner;

public class Lab2_final {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//* Exercise 1
		// int	x = sc.nextInt();
		// System.out.println(x);
		// boolean w = sc.nextBoolean();
		// System.out.println(w);
		// double	y = sc.nextDouble();
		// System.out.println(y);
		// String z = sc.next();
		// System.out.println(z);

		// int	x = sc.nextInt();
		// System.out.println(x);
		// int	w = sc.nextInt();
		// System.out.println(w);
		// int	y = sc.nextInt();
		// System.out.println(y);
		// int	z = sc.nextInt();
		// System.out.println(z);

		// String	x = sc.next();
		// System.out.println(x);
		// String	w = sc.next();
		// System.out.println(w);
		// String	y = sc.next();
		// System.out.println(y);
		// String	z = sc.next();
		// System.out.println(z);

		//* Exercise 2 */
		// String st1 = new String("Hello");
		// String st2 = "Programming";
		// System.out.println(st1);
		// System.out.println(st2);

		// System.out.println(st2.length());
		// System.out.println(st2.charAt(3));
		// System.out.println(st2.concat(str1));
		// System.out.println(st2.indexOf("a"));
		// System.out.println(st2.indexOf("m", 7));
		// System.out.println(st2.substring(3));
		// System.out.println(st2.substring(3, 6));

		//* Exercise 3 */
		// String str1 = new String("HELLO");
		// String str2 = "Hello";
		// System.out.println(str1 == str2);
		// System.out.println(str1.compareTo(str2));
		// System.out.println(str1.compareToIgnoreCase(str2));

		// String str1 = new String("ape");
		// String str2 = "zebra";
		// System.out.println(str1.compareTo(str2));

		// String str1 = new String("zebra");
		// String str2 = "ape";
		// System.out.println(str1.compareTo(str2));

		// String str1 = new String("ape");
		// String str2 = "ape";
		// System.out.println(str1.compareTo(str2));

		// String str1 = new String("ape");
		// String str2 = "apple";
		// System.out.println(str1.compareTo(str2));

		// String str1 = new String("Ape");
		// String str2 = "ape";
		// System.out.println(str1.compareTo(str2));

		// String str1 = new String(" ape");
		// String str2 = "Ape";
		// System.out.println(str1.compareTo(str2));

		// String str1 = new String("cat");
		// String str2 = "catfish";
		// System.out.println(str1.compareTo(str2));

		//* Exercise 4 */
		// int x = 10;
		// if (x == 10)
		// 	System.out.println("x is equal to 10");

		// int x = 10;
		// if (x == 10)
		// 	System.out.println("x is equal to 10");
		// else
		// 	System.out.println("x is " + x);

		// int	x = 10;
		// System.out.println(x == 10 ? "x is equal to 10" : "x is " + x);

		// int x = 10;
		// if ( x == 10){
		// 	System.out.println("x is equal to 10");
		// }
		// else if (x < 10) {
		// 	System.out.println("x is less than 10");
		// }
		// else if (x > 10 && x < 50) {
		// 	System.out.println("x is greater than 10");
		// }
		// else {
		// 	System.out.println("x is " + x);
		// }

		//* Exercise 5 */
		// int	x = 1;
		// boolean	result1 = (x > 1) & (x++ < 10);
		// System.out.println(result1);
		// System.out.println(x);

		// x = 1;
		// boolean	result2 = (x > 1) && (x++ < 10);
		// System.out.println(result2);
		// System.out.println(x);

		//* Exercise 6 */
		// int	x = 2;
		// switch (x) {
		// 	case 1:
		// 		System.out.println("one");
		// 	case 2:
		// 		System.out.println("two");
		// 	case 3:
		// 		System.out.println("three");
		// 	case 4:
		// 		System.out.println("four");
		// 	case 5:
		// 		System.out.println("five");
		// }

		// int	x = 2;
		// switch (x) {
		// 	case 1:
		// 		System.out.println("one"); break;
		// 	case 2:
		// 		System.out.println("two"); break;
		// 	case 3:
		// 		System.out.println("three"); break;
		// 	case 4:
		// 		System.out.println("four"); break;
		// 	case 5:
		// 		System.out.println("five"); break;
		// }

		// int	x = 7;
		// switch (x) {
		// 	case 1:
		// 		System.out.println("one"); break;
		// 	case 2:
		// 		System.out.println("two"); break;
		// 	case 3:
		// 		System.out.println("three"); break;
		// 	case 4:
		// 		System.out.println("four"); break;
		// 	case 5:
		// 		System.out.println("five"); break;
		// }

		// int	x = 7;
		// switch (x) {
		// 	case 1:
		// 		System.out.println("one"); break;
		// 	case 2:
		// 		System.out.println("two"); break;
		// 	case 3:
		// 		System.out.println("three"); break;
		// 	case 4:
		// 		System.out.println("four"); break;
		// 	case 5:
		// 		System.out.println("five"); break;
		// 	default:
		// 		System.out.println("no match"); break;
		// }

		// String	x = "four";
		// switch (x) {
		// 	case "one":
		// 		System.out.println(1); break;
		// 	case "two":
		// 		System.out.println(2); break;
		// 	case "three":
		// 		System.out.println(3); break;
		// 	case "four":
		// 		System.out.println(4); break;
		// 	case "five":
		// 		System.out.println(5); break;
		// 	default:
		// 		System.out.println("no match"); break;
		// }


		//! DIY
		//* while loop */
		// int	cases = sc.nextInt(); //* get number of test cases
		// int count = 0;
		// while (count < cases) {
		// 	System.out.print(count + " ");
		// 	count++;
		// }

		//* name, surname,  age, studyProgram */
		// String name = sc.next();
		// String sur = sc.next();
		// int	age = sc.nextInt();
		// String study = sc.next();

		// System.out.println("My name is " + name + " " + sur);
		// System.out.println("I'm " + age + " years old");
		// System.out.println("I'm studying " + study);

		//* Get input of a sentence from scanner as String. Then: */
		// String input = sc.next();
		// System.out.println(input.toLowerCase());
		// System.out.println(input.toUpperCase());
		// System.out.println(input.length());
		// if (input.length() > 2) {
		// 	System.out.println(input.charAt(2));
		// 	System.out.println(input.substring(2));
		// }
		// else
		// 	System.out.println("String is too short!");

		//* Get two Strings from Scanner, then compare them */
		// String str1 = sc.next();
		// String str2 = sc.next();
		// if (str1.equalsIgnoreCase(str2))
		// 	System.out.println("equal");
		// else
		// 	System.out.println("not equal");

		// System.out.println(str1.equalsIgnoreCase(str2) ? "equal" : "not equal");

		//* Day in a week, use if-else to print day in a week */
		// int	day = sc.nextInt();
		// if (day >= 1 && day <= 7) {
		// 	if (day == 1)
		// 		System.out.println("Monday");
		// 	else if (day == 2)
		// 		System.out.println("Tue");
		// 	else if (day == 3)
		// 		System.out.println("Wed");
		// 	else if (day == 4)
		// 		System.out.println("Thu");
		// 	else if (day == 5)
		// 		System.out.println("Fri");
		// 	else if (day == 6)
		// 		System.out.println("Sat");
		// 	else if (day == 7)
		// 		System.out.println("Sun");
		// }

		//* Day in a week, use switch function to print day in a week */
		// int	day = sc.nextInt();
		// switch (day) {
		// 	case 1:
		// 		System.out.println("Mon"); break;
		// 	case 2:
		// 		System.out.println("Tue"); break;
		// 	case 3:
		// 		System.out.println("Wed"); break;
		// 	case 4:
		// 		System.out.println("Thu"); break;
		// 	case 5:
		// 		System.out.println("Fri"); break;
		// 	case 6:
		// 		System.out.println("Sat"); break;
		// 	case 7:
		// 		System.out.println("Sun"); break;
		// 	default:
		// 		System.out.println("no match");
		// }
	}
}
