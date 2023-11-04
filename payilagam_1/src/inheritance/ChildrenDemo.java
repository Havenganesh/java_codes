package inheritance;

import java.util.Scanner;

public class ChildrenDemo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
//	Children child1=new Children();
//	child1.bikeRiding();
//	child1.bikeRiding("jawa");
	Father father;
	
	while(true) {
		System.out.println("please enter the age");
		int age=input.nextInt();
		if(age>10) {
			father=new Children();
		}else if(age <10){
			father=new Children1();
		}else {
			break;
		}
		father.bikeRiding();
	}
	

}
}
