package T3_1014;
import java.util.Scanner;
public class Array4_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] students = new int[a];
		for(int i = 0; i < students.length; i++) {
			students[i]=sc.nextInt();
		}
		int total = 0;
		double average = 0;
		for(int i = 0; i < students.length; i++) {
			total += students[i];
		}
		average = (double) total / 5 ;
		System.out.println("점수 총합: " + total);
		System.out.println("점수 평균: " + average);
	}
}
