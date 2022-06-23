package task19;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	try {
		String username = sc.nextLine();
		if((username.length()<10) || (username.contains("&"))){
			throw new InvalidUserName();
		}else {
			System.out.println("username is validated");
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
