package projects.conditionals;

import java.util.Scanner;

public class UserLogin {
	
	public static void main(String[] args) {
		
		String user, username = "PatikaDev";
		String pass, password = "Patika.dev2000";
		String answer;
		boolean isUser, isPass;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		user =scan.next();
		System.out.println("Enter password:");
		pass=scan.next();
		
		isUser = user.equals(username);
		isPass = pass.equals(password);
		
		
		if(isUser && isPass){
			System.out.println("Successfully Logged In!");
		}else if(isUser && !isPass) {
			System.out.println("Password is Incorrect!");
			System.out.println("Would you like to reset password ?");
			answer = scan.next();
			
			if(answer.equalsIgnoreCase("yes")) {
				System.out.println("Please enter new password: ");
				pass=scan.next();
				if(pass.equals(password)) {
					System.out.println("Your new password can't be the same as the old one! ");
				}else {
					System.out.println("Password created.");
				}
			}else {
				System.out.println("Try Again!");
			}
			
		}else {
			System.out.println("Try Again!");
		} 
		
		
		scan.close();
		
	}
}
