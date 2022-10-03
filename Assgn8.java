import java.util.Scanner;

class Assgn8{
	
	public static void main(String [] args){
		
		int basic;
		float hra,da;
		
		System.out.println("Enter the basic salary : ");
		Scanner sc = new Scanner (System.in);
		basic=sc.nextInt();
		
		if(basic<10000){
			hra = (float)(0.1*basic);
			da = (float)(0.9*basic);
			float gross = basic+hra+da;
			System.out.println("The gross salary is : "+gross);
		}
		if(basic>=10000){
			hra = 2000;
			da = (float)(0.98*basic);
			float gross = basic+hra+da;
			System.out.println("The gross salary is : "+gross);
		}
		
		
	}
	
}