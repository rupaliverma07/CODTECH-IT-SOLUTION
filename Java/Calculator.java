import java.util.Scanner;

class Calculator
{
	
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		char repeat ='y';
		
		do
		{
		System.out.println("-----Calculator-----");
		
		System.out.println("\n Enter First Number -");
		double num1 = sc.nextDouble();
		
		System.out.println("\n Enter Second Number -");
		double num2 = sc.nextDouble();
		
		
		System.out.println("\n Enter an operation  (+ , -, *, /)");
		char operation = sc.next().charAt(0);
		
		double result = 0.0 ;
		
		switch(operation)
		{
			case '+':	result = num1 + num2;
			break;
			
			case '-':	result = num1 - num2;
			break;
			
			case '*':	result = num1 * num2;
			break;
			
			case '/':	
						if(num2 !=0)result = num1 / num2;
						else 
						{
							System.out.println("number cannot divide by zero");
							System.exit(0);
						}
			break;
			
			default:	System.out.println("Invalid Operation !!!");
						System.exit(0);
			break;
			
			
		}
		System.out.println("\n-----Result-----\n");
		System.out.println(num1+" "+operation+"  "+num2+" = "+result+"\n");
		
		System.out.println("\n If you want to continue enter 'y' otherwise enter a key -");
		repeat=sc.next().charAt(0) ;
		
		}while(repeat == 'y' || repeat =='Y');
	
	}
}