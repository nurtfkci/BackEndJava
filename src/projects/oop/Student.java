package projects.oop;

import java.util.Scanner;

public class Student {

	Course c1, c2, c3;
	String name, id;
	double gpa, grade;
	int total;

	Student(String name, String id, Course a, Course b, Course c) {
		this.name = name;
		this.id = id;
		this.c1 = a;
		this.c2 = b;
		this.c3 = c;
		gpa = 0;

	}

	void studInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student id: " + id);
		System.out.println("\nGPA: " + getGpa());
		System.out.println("\n");
	}

	void addGrades(Course c) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n" + c.courseName);
		System.out.print("Please enter midterm: ");
		double grade = scan.nextDouble();
		if (grade >= 0 && grade <= 100) {
			c.grades1 = grade;
		}

		System.out.print("Please enter finals: ");
		grade = scan.nextDouble();
		if (grade >= 0 && grade <= 100) {
			c.grades2 = grade;
		}

		System.out.print("Please enter quiz: ");
		grade = scan.nextDouble();
		if (grade >= 0 && grade <= 100) {
			c.grades3 = grade;
		}

	}

	void getGrades(Course c) {

		addGrades(c);

		getAverage(c);
		System.out.println("\nGrades for class " + c.courseName);
		System.out.println("Grade for Midterm: " + c.grades1);
		System.out.println("Grade for Quiz: " + c.grades3);
		System.out.println("Grade for Final: " + c.grades2);
		System.out.println("Average for class: " + c.average);
		total += c.credits;

	}

	void getAverage(Course c) {

		double letter = (c.grades1 * 0.45) + (c.grades2 * 0.35) + (c.grades3 * 0.20);
		c.average = letter;

		if (letter > 90) {
			grade = 4.00;
		} else if (letter > 70) {
			grade = 3.00;
		} else if (letter > 50) {
			grade = 2.00;
		} else {
			grade = 1.00;
		}

		gpa += (grade * c.credits);

	}

	double getGpa() {

		getGrades(c1);
		getGrades(c2);
		getGrades(c3);

		gpa /= total;

		return gpa;

	}

}
