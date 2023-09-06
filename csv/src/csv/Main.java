package csv;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			File filename = new File("C:\\Users\\user\\Documents\\studentdetails.csv");
			Scanner myReader = new Scanner(filename);
			int i = 0;
			while (myReader.hasNextLine()) {
				String emailid;
				String password;
				String cpassword;
				String mobilenumber;
				String address;
				String name;

				String studentrecord = myReader.nextLine();
				if (i > 0) {

					String[] data = studentrecord.split(",");

					System.out.println(name = data[0]);

					System.out.println(emailid = data[1]);

					System.out.println(password = data[2]);

					System.out.println(cpassword = data[3]);
					System.out.println(mobilenumber = data[4]);

					System.out.println(address = data[5]);
					Students s1 = new Students();
					try {
						s1.validateName(name);
						s1.validateEmail(emailid);
						s1.validatePassword(password);
						s1.validateCpassword(cpassword);
						s1.checksPassword(password, cpassword);
						s1.isValidnumber(mobilenumber);
						s1.validateAddress(address);
						s1.findDuplicate(emailid);
						s1.save(name, emailid, password, cpassword, mobilenumber, address);
                        

					} catch (StudentsException e) {
						System.out.println(e.getMessage());
					}

					System.out.println("---------------------");
					System.out.println("---------------------");

				}  

				i = i + 1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
