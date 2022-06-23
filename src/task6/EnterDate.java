package task6;

import java.util.Scanner;

public class EnterDate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CheckingDate checks=new CheckingDate();
		System.out.println("Enter date to check :");
		String date=sc.nextLine();
		checks.AfterOrNot(date);
		checks.earlierOrNot(date);
		checks.converter(date);
	}

}
