import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int d=n1%10;
      int e=n1/10;
      int s=d+e;
      System.out.println(s);
	}
}