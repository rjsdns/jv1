package T3_1014;

public class Array1 {
	public static void main(String[] args) {
		int[] students;
		students = new int[5];
		
		students[0] = 0;
		students[1] = 10;
		students[2] = 20;
		students[3] = 30;
		students[4] = 40;
		
		System.out.println("학생 1의 점수: " + students[0]);
		System.out.println("학생 2의 점수: " + students[1]);
		System.out.println("학생 3의 점수: " + students[2]);
		System.out.println("학생 4의 점수: " + students[3]);
		System.out.println("학생 5의 점수: " + students[4]);
		
		System.out.println(students);
	}
}
