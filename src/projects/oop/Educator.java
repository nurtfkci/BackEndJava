package projects.oop;

public class Educator {

	String educator;
	String mail;
	String branch;

	Educator(String name, String com, String branch) {
		this.educator = name;
		this.mail = com;
		this.branch = branch;
	}

	void printEd() {
		System.out.println("Educator: " + educator);
		System.out.println("Communication: " + mail);
		System.out.println("Branch: " + branch);
	}

}
