package task21;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Operations obj=new Operations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for the operations");
		int num=sc.nextInt();
		try {
			if(num!=1) {
				throw new AssertionError();
			}
			else {
				System.out.println("Enter 1-for Plus ,2-for Minus,3-for divide ,4-for Multiply");
				int number=sc.nextInt();
				if(number==obj.plus) {
					System.out.println("Enter the values :");
					obj.plus(sc.nextDouble(),sc.nextDouble());
				}
				else if(number==obj.minus) {
					System.out.println("Enter the values :");
					obj.minus(sc.nextDouble(), sc.nextDouble());
				}
				else if(number==obj.divide) {
					System.out.println("Enter the values :");
					obj.divide(sc.nextDouble(),sc.nextDouble());
				}
				else if(number==obj.multiply) {
					System.out.println("Enter the values :");
					obj.multiply(sc.nextDouble(), sc.nextDouble());
				}
				else {
					System.err.println("Please choose correct option");
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
