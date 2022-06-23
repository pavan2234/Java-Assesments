package task10;

public class Add extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Add Operation");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
