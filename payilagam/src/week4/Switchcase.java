package week4;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("please enter a value");
		int number=input.nextInt();
		switch(number) {
		case 1:
			System.out.println("this is blue");
		case 2:
			System.out.println("this is red");
		default:
			System.out.println("no selection");
		}
	}
}
