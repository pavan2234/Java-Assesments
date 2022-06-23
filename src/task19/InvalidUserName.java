package task19;

public class InvalidUserName extends Exception{
		InvalidUserName(){
			System.err.println("Please enter valid username");
		}
}
