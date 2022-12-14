//Import here
import java.util.*;

class p84_Permutation {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int num = sc.nextInt();

  	for (int i = 0; i < num; i++) {
  	    String str1 = sc.next();
  	    String str2 = sc.next();
  	    char[] arr1 = str1.toCharArray();
  	    char[] arr2 = str2.toCharArray();
  	    Arrays.sort(arr1);
  	    Arrays.sort(arr2);

		/*
		if (Arrays.equals(arr1, arr2) == true) {
			sout("Yes");
		} else {
			sout("No");
		}
		 */

  	    if (arr1.length == arr2.length) {
  	        for (int j = 0; j < arr1.length; j++) {
  	            if (arr1[j] != arr2[j]) {
  	                System.out.println("NO");
  	            }
  	        }
  	        System.out.println("YES");
  	    }
  	    else {
  	        System.out.println("NO");
  	    }

  	}
  }
}
