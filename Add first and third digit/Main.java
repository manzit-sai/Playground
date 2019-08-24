import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int d=(n1/100);
      int p=(n1%10);
      int s=d+p;
      System.out.println(s);
	}
}