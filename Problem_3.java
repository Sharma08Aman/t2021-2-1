package test;
import java.util.*;
public class Problem_3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a limit : ");
		int a=scan.nextInt();
		int num=1;
		if (a%2==0)
			a=a-1;
		for(int i=1;i<=a;i++){
			System.out.print(num+" ");
			num=num+2;			
		}
		scan.close();

	}

}
