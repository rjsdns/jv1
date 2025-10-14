package T3_1014;

public class Array2 {
	public static void main(String[] args) {
		int[] students = new int[]{50, 60, 70, 80, 90};
			
		for(int i = 0; i < students.length; i++) {
			System.out.println("학생" + (i + 1) + "점수: " + students[i]);
		}
	}
}
