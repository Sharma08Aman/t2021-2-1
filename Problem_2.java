package test;
import java.util.*;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter sequence limit : ");
		int num=1;
		int a=scan.nextInt();
		scan.nextLine();
		for(int i=1;i<=a;i++){
			System.out.print(num+" ");
			num=num+2;
			scan.close();
		}
	}

}
