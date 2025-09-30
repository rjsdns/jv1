package T1_0930;
import java.util.Scanner;
public class If {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("연도 입력");
		int y=s.nextInt();
		
		if(y%4==0)
			/*if(y%100==0)
			 * 	System.out.println("1");
			 *else if(y%100==0)
			 *	System.out.println("0");
			 *else
			 *	System.out.println("1");
		*else
		*	System.out.println("0");*/
			if(y%100!=0||y%400==0)
				System.out.println("1");
			else
				System.out.println("0");
		else
			System.out.println("0");
		s.close();
	}
}
