import java.util.Scanner;

class Assgn5{
	
	public static void main(String [] args){
		
		System.out.println("Enter the number of days : ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int year = n/365;
		System.out.println("The number of years is : "+year);
		n=n%365;
		
		int month=n/30;
		System.out.println("The number of months is : "+month);
		n=n%30;
		
		System.out.println("The number of days is : "+n);	
		
		
	}
	
	
}