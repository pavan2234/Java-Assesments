package task5;

public class OnlyOnce {
	public void start() {
		System.out.println("Initiated only once");
	}

	public static void main(String[] args) {
		OnlyOnce o = new OnlyOnce();
		o.start();
		

	}

}
