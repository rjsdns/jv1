package T1_0930;
import java.util.Scanner;
public class Three {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("첫번째 수");
		int a=s.nextInt();
		System.out.println("두번째 수");
		int b=s.nextInt();
				
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		s.close();
	}
}
