import java.util.*;

public class p90_Capitalize {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	 String str = sc.next();
  	System.out.print(recur(str, 0));
	sc.close();
  }

  private static String recur(String str, int index) {
      if (index == str.length()) {
          return "";
      }
      if (str.charAt(index) >= 65 && str.charAt(index) <= 90) {
          return str.charAt(index) + recur(str, index+1);
      }
      return recur(str, index+1);
  }
}
