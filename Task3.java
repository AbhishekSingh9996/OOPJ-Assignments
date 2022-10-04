import java.util.*;


public class Task3{
	
	public static void main(String [] args){
	
		System.out.println("Enter the two number : ");
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//double num3 = sc.nextDouble();
		//int num4=sc.nextInt();
				
		int power1 = Calculate.powerInt(num1, num2);
		System.out.println(power1);
		
		
		
	}
}

class Calculate{
	
		static int powerInt(int num1,int num2){
		int power = (int)(Math.pow(num1,num2));
		return power;
	}
	
}