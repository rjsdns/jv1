package T4_1104;
import java.util.Scanner;

public class B2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[9];
		int max = 0;
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i] > max) {
				max = a[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
		sc.close();
	}
}
