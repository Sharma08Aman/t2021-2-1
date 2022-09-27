package test;
import java.util.*;

public class Problem_1 {

	public static void main(String[] args) {
		double result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to operate");
		System.out.println("First number :");
		double a=scan.nextDouble();
		System.out.println("Second number :");
		double b=scan.nextDouble();
		scan.nextLine();
		System.out.println("Your two operands are : "+a+" & "+b);
		System.out.println("Enter The operation you want to perform as (add for addition, sub for substraction, mul for multlipication, div for division)");
		String s=scan.next();
		Calculator c = new Calculator();	
		if (s.equals("add")){
			result=c.add(a, b);
			System.out.println("Result of your operation : "+result);
		}
		else if (s.equals("sub")){
			result=c.sub(a, b);
			System.out.println("Result of your operation : "+result);
		} 
		else if (s.equals("mul")){
			result=c.mul(a, b);
			System.out.println("Result of your operation : "+result);
		}
		else if (s.equals("div")){
			if (a!=0 && b!=0){
				result=c.div(a, b);
				System.out.println("Result of your operation : "+result);
			}
			else
				System.out.println("Enter non zero numbers for division");			
		} 
		else 
			System.out.println("Enter valid operation");		
		scan.close();
	}
}
	

