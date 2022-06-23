package task13;

public class Contact extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Contact number is 7896541238");
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
