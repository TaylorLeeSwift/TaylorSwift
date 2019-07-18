package guess;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("please input a number to guess between 1 and 100 ");
	Scanner in = new Scanner(System.in);
	int number = (int)(Math.random()*100+1);
	int a;
	int count = 0;
	a = in.nextInt();
	while(a!=number)
	{if(a>number)
	{
		count = count+1;
		System.out.println("the number which you guess is bigger than the number");
		System.out.println("guess again");
		a = in.nextInt();
	}
	else
		{
		count = count+1;
		System.out.println("the number which you guess is smaller than the number");
		System.out.println("guess again");
		a = in.nextInt();
	}
	}
	count = count+1;
	System.out.println("you are ture, and you guess"+count+"times");
	System.out.println(a +"  " + number);
	}
}
