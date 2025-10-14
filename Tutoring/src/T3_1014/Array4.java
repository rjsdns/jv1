package T3_1014;

public class Array4 {
	public static void main(String[] args) {
		int[] students = new int[] {90, 80, 70, 60, 50};
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
