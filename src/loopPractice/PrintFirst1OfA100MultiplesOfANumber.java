package loopPractice;

import java.util.Scanner;

public class PrintFirst1OfA100MultiplesOfANumber {

	Scanner scan= new Scanner(System.in);
	
	public void Multiples(){
		System.out.println("enter your name");
		String username= scan.next();
		System.out.println("Hi  " + username+ " Find out first 100  multiples of  required number");
		System.out.println("enter your number");
		int n= scan.nextInt();
		
		
		System.out.println("enter the number for which you need 10 multiples");
			for(int i=0;i<100;i++){
			System.out.println( n + "*" + i +"=" +(n*i));
		}
	}
	
	public static void main(String[] args) {
		
		PrintFirst1OfA100MultiplesOfANumber c= new PrintFirst1OfA100MultiplesOfANumber();
		c.Multiples();
		// TODO Auto-generated method stub

	}

}
