import java.util.Scanner;

class Assgn2{
	
	public static void main(String [] args){
		
		double r;
		System.out.println("Enter the radius of circle: ");
		Scanner sc = new Scanner(System.in);
		r=sc.nextDouble();
		
		System.out.println("Area of the circle is "+(3.147*2*r));
		System.out.println("Circumference of the circle is "+(3.147*r*r));
		
		
	}
}