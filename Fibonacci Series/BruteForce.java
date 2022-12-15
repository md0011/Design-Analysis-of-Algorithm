import java.util.*;

public class BruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number of fibonachi you want");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int result=0;
		while(n>0) {
			result = a+b;
			a=b;
			b=result;
			n--;
			
		}
		System.out.println("The fibonachi of the entered number is ");
		System.out.println(a);
		
	}

}
