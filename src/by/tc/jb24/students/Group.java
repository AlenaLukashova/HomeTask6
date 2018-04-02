package by.tc.jb24.students;

public class Group {

	private String groupId;
	private Student[] studentGroup = new Student[5];
	private int countOfStudents = 0;

	public Group(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupId() {
		return groupId;
	}

	public Student[] getStudentGroup() {
		return studentGroup;
	}

	public void addStudentToGroup(Student student) {
		if (countOfStudents>=5) {
			System.out.println("There could be only 5 students in one group.");
		} else {
			studentGroup[countOfStudents] = student;
		}
		countOfStudents = countOfStudents + 1;
	}

	public double countAverageMarkOfGroup() {
		double sumOfAverageStudentMark = 0;

		for (int i = 0; i < studentGroup.length; i++) {
			Student student = studentGroup[i];
			sumOfAverageStudentMark = sumOfAverageStudentMark
					+ student.countAverageMarkOfStudent();
		}

		double averageMarkOfGroup = sumOfAverageStudentMark / studentGroup.length;
		return averageMarkOfGroup;
	}

	public int countBestStudents() {
		int numberOfBestStudents = 0;

		for (int i = 0; i < studentGroup.length; i++) {
			Student student = studentGroup[i];
			if (student.isStudentTheBest()) {
				numberOfBestStudents++;
			}
		}
		return numberOfBestStudents;
	}

	public int countStudentsWith2() {
		int numberOfStudentsWith2 = 0;

		for (int i = 0; i < studentGroup.length; i++) {
			Student student = studentGroup[i];
			if (student.isStudentHas2()) {
				numberOfStudentsWith2++;
			}
		}
		return numberOfStudentsWith2;
	}
}
