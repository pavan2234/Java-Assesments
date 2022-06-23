package task10;

public class DisplayMain {

	public static void main(String[] args) throws InterruptedException {
	
		Add addition = new Add();
		Average average = new Average();
		addition.start();
		average.start();

	}

}
