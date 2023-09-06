package csv;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		Students s1 = new Students();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the emailid");
		String emailid = sc.nextLine();
		
		System.out.println("Enter the password");
		String password = sc2.nextLine();

		
		try {
			s1.login(emailid, password);
		} catch (SQLException | StudentsException e) {
			
			e.printStackTrace();
		} 


	}

}
