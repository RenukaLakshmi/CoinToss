package Day3HackerRank;

import java.util.Scanner;



public class Print100Multiples {
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
		
		Print100Multiples c= new Print100Multiples();
		c.Multiples();
		// TODO Auto-generated method stub

	}

}


