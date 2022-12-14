import java.util.*;

class p80_ToOctal{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int num = sc.nextInt();
  	System.out.print(Integer.toString(num, 8));
	sc.close();
  }
}
