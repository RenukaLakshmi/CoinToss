package Day3HackerRank;

import java.util.Scanner;

public class GuessNumber {
	Scanner scan  =new Scanner(System.in);
	

	
	public void howbigmynumberis(){
		System.out.println("enter your name");
		String username= scan.next();
		System.out.println("Hi  " + username);
		System.out.println("enter your number");
		int x=scan.nextInt();
		if(x>0 && x<=10){
			System.out.println("Here you go " + x + " Chocolates "+ "good " + username  );
			System.out.println("It is a small number");
			
			
		}
		else if(x>10 && x<=100){
			System.out.println("Here you go " + x + " Chocolates "+ "Excellent " + username  );
			System.out.println("your number is big");
			
		}
		else{
			System.out.println("Here you go " + x + " Chocolates "+ "Awesome " + username  );
		System.out.println("The number is huge");
		
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessNumber G= new GuessNumber();
		G.howbigmynumberis();
		

	}

}
