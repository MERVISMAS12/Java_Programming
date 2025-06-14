package MyPackage;

public class IfElseControlStatements {
	public static void main(String args[]) {
		int marks = 60;
		char grade;
		if(marks >= 90) {
			grade = 'A';
		}
		else if(marks >= 80) {
			grade = 'B';
		}
		else if(marks >= 70) {
			grade = 'C';
		}
		else if(marks >= 60) {
			grade = 'D';
		}
		else if(marks >= 50) {
			grade = 'E';
		}
		else{
			grade = 'F';
		}
		System.out.println("Grades: "+ grade);
		
		String res = (grade == 'F') ? "Fail" : "Pass";
		System.out.println("Results: "+ res);
	}
	
}
