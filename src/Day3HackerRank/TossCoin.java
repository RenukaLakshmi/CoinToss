package Day3HackerRank;

import java.util.Random;
import java.util.Scanner;

public class TossCoin {

	public String Tossacoin(){
		Scanner scan=new Scanner(System.in);
		Random rd=new Random(scan.nextInt());
		
		int a=Math.abs(rd.nextInt())%2;
		
		if(a==0){
			 return "HEADS";
			
		}
		else
			return"TAILS";
	}
	public static void main(String[] args) {
		TossCoin c= new TossCoin();
		System.out.println(c.Tossacoin());
		// TODO Auto-generated method stub

	}

}
