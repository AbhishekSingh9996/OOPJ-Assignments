import java.util.Scanner;

class Assgn4{
	
	public static void main(String [] args){
		
		double p,r,n;
		System.out.println("Enter the principle : ");
		Scanner sc = new Scanner(System.in);
		p=sc.nextDouble();
		System.out.println("Enter the rate of interest : ");
		r=sc.nextDouble();
		System.out.println("Enter the number of years : ");
		n=sc.nextDouble();
		
		System.out.println("Simple interest is : "+(p*n*r)/100);
		
		
		
	}
	
	
}