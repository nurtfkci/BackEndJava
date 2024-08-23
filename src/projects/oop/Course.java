package projects.oop;

public class Course {

	Educator teach;
	String course, courseName;
	String classId, prefix;
	double grades1, grades2, grades3;
	double average;

	int credits;

	Course(String name, String id, String prefix, int credits) {
		this.course = name;
		this.classId = id;
		this.prefix = prefix;
		this.courseName = this.prefix + this.classId;
		this.credits = credits;
		average = 0;

	}

	void addEducator(Educator e) {
		if (e.branch.equals(this.prefix)) {
			this.teach = e;
		} else {
			System.out.println("Educator can not attend this branch!");
		}
	}

	void printEdInfo() {
		this.teach.printEd();
	}

}
