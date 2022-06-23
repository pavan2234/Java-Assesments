package task27;

import java.io.FileWriter;
import java.io.IOException;

public class ManyCatches {

	public static void main(String[] args) {
		try {
			int a[]=new int[8];    
			a[8]=100/0;    
			FileWriter f=new FileWriter("D://FileHandling//pavan.txt");
			f.write("Hii");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Solved"+e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException  ae) {
			System.out.println("ArrayIndexOutOfBoundsException solved"+ae);
			return;
		}
		catch(IOException a) {
			System.out.println("NullPointerException is handled"+a);
			return;
		}
		catch(Exception n) {
			System.out.println("Nothing to do...");
			return;
		}
		finally {
			System.out.println("Exceptions Are Handled");
		}
	}

}
