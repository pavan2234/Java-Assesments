package task16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Converting {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader filereader=new FileReader("D:\\FileHandling\\TASKS.txt");
		PrintWriter out =new PrintWriter("D:\\FileHandling\\Taskno16.xls");
		Scanner sc=new Scanner(filereader);
		while(sc.hasNext()) {
			out.println(sc.next());
		}
		out.close();
		System.out.println("Success");

	}

}
