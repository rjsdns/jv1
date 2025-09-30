package T1_0930;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수 입력");
		
		int n = s.nextInt();
		
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}
}
