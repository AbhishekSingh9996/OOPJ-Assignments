import java.util.Scanner;

class Assgn7{
	
	public static void main(String [] args){
		
		System.out.println("Enter a number : ");
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		m=m+n;//m=m+n
		n=m-n;//n=m-n=m+n-n=m
		m=m-n;//m=m-n=m+n-m=n
		
		System.out.println("The numbers after swapping are "+m+" and "+n);
		
	}
	
	
}