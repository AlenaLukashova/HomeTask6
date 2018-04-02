package by.tc.jb24.students;

public class Main {
	
		public static void main(String[] args) {
									
			Student student1 = new Student("Student", "A");
			Student student2 = new Student("Student", "B");
			Student student3 = new Student("Student", "C");
			Student student4 = new Student("Student", "D");
			Student student5 = new Student("Student", "E");

			student1.setMathMark(5);
			student2.setMathMark(3);
			student3.setMathMark(5);
			student4.setMathMark(5);
			student5.setMathMark(2);
			
			student1.setEnglishMark(5);
			student2.setEnglishMark(5);
			student3.setEnglishMark(5);
			student4.setEnglishMark(4);
			student5.setEnglishMark(4);
			
			student1.setJavaMark(5);
			student2.setJavaMark(3);
			student3.setJavaMark(5);
			student4.setJavaMark(4);
			student5.setJavaMark(2);

			Group group = new Group("group");
						
			group.addStudentToGroup(student1);
			group.addStudentToGroup(student2);
			group.addStudentToGroup(student3);
			group.addStudentToGroup(student4);
			group.addStudentToGroup(student5);
			
			double averageMarkOfGroup = group.countAverageMarkOfGroup();
			printAverageMarkOfGroup(averageMarkOfGroup);
			
				
			printAverageMarkOfEachStudent(group);
			
			int numberOfBestStudents = group.countBestStudents();
			printNumberOfBestStudents(numberOfBestStudents);
			
			int numberOfStudentsWith2 = group.countStudentsWith2();
			printNumberOfStudentsWith2(numberOfStudentsWith2);

		}
	
		public static void printAverageMarkOfGroup(double averageMarkOfGroup) {
			System.out.println("Average mark of group:" + averageMarkOfGroup + ";");
		}
		
		public static void printAverageMarkOfEachStudent(Group group) {
			Student[] students = group.getStudentGroup();
			for(int i = 0; i < students.length; i++){
				Student student = students[i];
				System.out.println("Average mark of Student " + student.getFullName() + " is " + student.countAverageMarkOfStudent() + ";");
			}
		}
		
		public static void printNumberOfBestStudents(int numberOfBestStudents) {
			System.out.println("Number of the best students:" + numberOfBestStudents + ";");
		}
		
		public static void printNumberOfStudentsWith2(int numberOfStudentsWith2) {
			System.out.println("Number of students with 2:" + numberOfStudentsWith2 + ";");
		}
}
