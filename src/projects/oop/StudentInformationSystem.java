package projects.oop;

public class StudentInformationSystem {

	public static void main(String[] args) {

		Course ceng = new Course("Computer Engineering", "101", "CENG", 4);
		Course phy = new Course("Physics", "303", "LAB", 3);
		Course chem = new Course("Chemistry", "201", "LAB", 2);

		Educator e = new Educator("Mahmut", "mahmut@edu", "CENG");
		Educator e1 = new Educator("Ayşe", "ayse@edu", "LAB");
		Educator e2 = new Educator("Ali", "Ali@edu", "LAB");

		Student s = new Student("Jason", "1820", ceng, phy, chem);
		Student s1 = new Student("Sarah", "1821", ceng, phy, chem);
		Student s2 = new Student("Mehmet", "1822", ceng, phy, chem);

		ceng.addEducator(e);
		phy.addEducator(e1);
		chem.addEducator(e2);

		s.studInfo();
		s1.studInfo();
		s2.studInfo();

	}

}
