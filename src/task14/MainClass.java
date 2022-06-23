package task14;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		Employee employee =new Employee();
		Manager manager=new Manager();
		employee.create();
		employee.write();
		employee.read();
		manager.write();
		manager.read();
	}

}
