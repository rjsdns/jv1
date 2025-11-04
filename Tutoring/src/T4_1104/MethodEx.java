package T4_1104;

public class MethodEx {
	public static void main(String[] args) {
		int a, b, c;
		a = 1; b = 2; c = 3;
		avg(a, b, c);
		
		double avg;
		avg = avg(a, b, c);
		System.out.println(avg);
	}
	public static double avg(int a, int b, int c) {
		double sum = a + b + c;
		return sum/3.0;
	}
}