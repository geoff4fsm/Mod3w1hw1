package gradepackage;

public class GradeClass {

	public static void main(String[] args) {
		int grade = 85;
				char letterGrade = grade>=90 ? 'A' : grade>=80 ? 'B' : grade>=70 ? 'C' : grade>=55 ? 'D' : 'F' ;
		System.out.println("Grade = " + letterGrade);
	}

}
