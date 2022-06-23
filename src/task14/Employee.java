package task14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Employee {
	public void create() throws IOException {
		File f = new File("D:\\FileHandling\\task14.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(f.exists()) {
			System.out.println("File created");
		}else {
			f.createNewFile();
		}
	}
	public void read() throws IOException {
		FileReader fr = new FileReader("D:\\FileHandling\\task14.txt");
		BufferedReader bfr = new BufferedReader(fr);
		int i;
		while((i=bfr.read())!=-1)
			System.out.print((char)i);
		
	}
	public void write() throws IOException {
		FileWriter fw = new FileWriter("D:\\FileHandling\\task14.txt");
		fw.write("This is file writer from employee class");
		fw.close();
		
	}
}
