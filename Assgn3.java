import java.util.Scanner;

class Assgn3{

public static void main(String [] args){
	
	System.out.println("Enter the marks of 5 subjects out of 100 : ");
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	int d =sc.nextInt();
	int e =sc.nextInt();
	double sum = a+b+c+d+e;
	double total =500;
	System.out.println("The sum of the marks for 5 subjects = "+sum);
	
	//if we take sum/total than it is int/int and the result received will be int that 0 and hence percentage will be 0
	
	
	System.out.println("Percentage marks = "+(double)((sum*100)/total));
	
	
}
}