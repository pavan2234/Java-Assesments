package task15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employee {
	public static void main(String[] args) throws IOException {
	File f = new File("D:\\FileHandling\\task15.txt");
	f.createNewFile();
	FileWriter fw = new FileWriter(f);
	fw.write("The information cannot be editable");
	if(f.canRead()) {
		f.setReadOnly();
	}else {
		System.out.println("Cannot Readable");
	}
	}

}
