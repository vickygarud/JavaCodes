package project;

import java.util.Scanner;

public class PasswordValidate {

	public static void validPassword(String pass)
	{
		boolean flag = false;

		// password should 8 characters long

		if (!((pass.length() >= 8) && (pass.length() <= 18))) // f==t=>false
		{
			flag = true;
			verifyPass(flag, pass);
		}

		// System.out.println("Program continued");

		// Should have at least 1 special character

		int cnt = 0;
		String str = "~!@#$%^&*()-+:<>?/|.,"; // for special characters
		for (int i = 0; i < str.length(); i++) 
		{
			String str1 = "";
			str1 = str1 + str.charAt(i);
			// System.out.println(str1);

			if (pass.contains(str1))
				cnt++;
		}
		if (cnt == 0)
		{
			flag = true;
			verifyPass(flag, pass);
		}

		// Should have at least 1 numeric

		cnt = 0;
		for (int i = 0; i <= 9; i++) // for 0 to 9 Digits
		{
			String str1 = Integer.toString(i);
			// System.out.print(str1+" ");

			if (pass.contains(str1)) // false = true => false
				cnt++;
		}

		if (cnt == 0)
		{
			flag = true;
			verifyPass(flag, pass);
		}

		// Should Have at least 2 Capital Letters
		cnt = 0;
		for (char i = 65; i <= 90; i++) // 65=A, 66=B,...90=Z ASCII value American Standard Code for Information
								// Interchange
		{
			String str1 = "";
			str1 = str1 + i;
			// System.out.print(str1+" ");
			//System.out.println(str1);
			if (pass.contains(str1))
				cnt++;

		}

		if (cnt < 2)
		{
			flag = true;
			verifyPass(flag, pass);
		}

		// Should Have at least 2 small case Letters

		cnt = 0;
		for (char i = 97; i <= 122; i++) // 97=a, 98=b,....122=z
		{
			String str1 = "";
			str1 = str1 + i;
			// System.out.print(str1+" ");

			if (pass.contains(str1))
				cnt++;

		}

		if (cnt < 2)
		{
			flag = true;
			verifyPass(flag, pass);
		}

		// pass.contains(compareToIgnoreCase("sun"));

		if (pass.contains(" ") || pass.contains("sun") || pass.contains("moon") || pass.contains("jupiter"))
		{
			flag = true;
			verifyPass(flag, pass);
		}

		if (flag == false)
			System.out.println("\n" + pass + " -- Password is valid");

	}

	static void verifyPass(boolean flag, String pass) {
		// if(flag==true)
		System.out.println("\n" + pass + "-- Password is invalid insufficient..!");
		System.exit(0);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Password to validate: ");
		String str = sc.next();

		validPassword(str); // call static method without creating any object of class PasswordValidate

		sc.close();

	}

}

/*
 * 
 * Write a code to validate a password with below conditions/constraints
 * Password should be at least 8 characters long 
 * Should not be blank Should have
 * at least 2 capital letters,
 *  2 small case letters,
 *  1 numeric, 1 special
 * character Should not have contain sun, moon, Jupiter word in it
 * 
 */

/*  O/P-
 * Enter Password to validate: Pasword@21Z Program continue
 * 
 * Pasword@21Z -- Password is valid
 * 
 * 
 * 
 * Enter Password to validate: Pdkdkkd@44
 * 
 * Pdkdkkd@44-- Password is invalid insufficient..!
 */