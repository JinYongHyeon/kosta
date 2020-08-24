package step5;

import step1.review.Student;

public class School {

	Student studnet[];

	public void printAll(Student studnet[]) {
		for (int i = 0; i < studnet.length; i++) {
			System.out.println(studnet[i].getId() + " " + studnet[i].getName() + " " + studnet[i].getAddress() + " ");
		}
	}

}
