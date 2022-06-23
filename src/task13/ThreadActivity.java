package task13;

public class ThreadActivity {

	public static void main(String[] args) throws InterruptedException {
	Name n = new Name();
	Contact c = new Contact();
	n.start();
	c.start();
	System.out.println(n.getName());
	n.setPriority(10);
	System.out.println(n.getPriority());
	c.setPriority(1);
	System.out.println(c.getPriority());
	n.join();
	c.join();
	System.out.println(n.isAlive());
	System.out.println(c.isAlive());
	System.out.println(n.isDaemon());
	System.out.println(c.isDaemon());

	}

}
