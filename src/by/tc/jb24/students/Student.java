package by.tc.jb24.students;

public class Student {
	
	String firstName;
	String lastName;
	int markSubject1;
	int markSubject2;
	int markSubject3;		
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getMathMark() {
		return markSubject1;
	}

	public void setMathMark(int markSubject1) {
		this.markSubject1 = markSubject1;
	}

	public int getEnglishMark() {
		return markSubject2;
	}

	public void setEnglishMark(int markSubject2) {
		this.markSubject2 = markSubject2;
	}

	public int getJavaMark() {
		return markSubject3;
	}

	public void setJavaMark(int markSubject3) {
		this.markSubject3 = markSubject3;
	}
	
	public double countAverageMarkOfStudent(){
		return (double)(markSubject1+markSubject2+markSubject3)/3;
	}
	
	public boolean isStudentTheBest() {
		return markSubject1==5 && markSubject2==5 && markSubject3==5;
	}
	
	public boolean isStudentHas2() {
		return markSubject1==2 || markSubject2==2 || markSubject3==2;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
}
