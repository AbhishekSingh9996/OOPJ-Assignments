import java.util.*;

class Task2{
	
	static void printline(int sum){
		if (sum!=0 && sum>=10)
			System.out.print(sum+"+");
		else 
			if(sum!=0 && sum<10)
			System.out.print(sum);	
	}
	
	public static void main(String [] args){ 
	
	System.out.println("Enter a number : ");
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	
	int temp=num;
	
	int d=1;
	int length=0;
	
	while(num>0){
		length++;
		num=num/10;		
	}
	int b=length-1;
	num=temp;
	
	while(temp>0){
		int digit=(int)(Math.pow(10,b));		
		int m=temp/digit;
		int sum=m*digit;
		printline(sum);
		temp=temp%digit;
		b--;
	}
		
	}
}