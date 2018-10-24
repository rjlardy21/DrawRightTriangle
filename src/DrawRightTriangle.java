
//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           DrawRightTriangle
// Files:           a list of all source files used by that program
// Course:          CS200 Spring 2018
//
// Author:          Reece Lardy
// Email:           rlardy@wisc.edu
// Lecturer's Name: Mark Renault
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates 
// strangers, etc do.  If you received no outside help from either type of 
// source, then please explicitly indicate NONE.
//
// Persons:         identify each person and describe their help in detail
// Online Sources:  identify each URL and describe their assistance in detail
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
import java.util.Scanner;

public class DrawRightTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInt;
		char userChar;
		System.out.print("Enter a character: ");
		userChar = sc.next().charAt(0);
		System.out.print("Enter triangle height (1-10): ");
		userInt = sc.nextInt();

		while (userInt < 1 || userInt > 10) {
			System.out.println("Please enter height between 1 and 10.");
			userInt = sc.nextInt();
		}
		System.out.println("");
		for (int i = 1; i <= userInt; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(userChar + " ");
			}
			System.out.println("");
		}
	}
}
