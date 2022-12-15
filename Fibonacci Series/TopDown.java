import java.util.*;

public class TopDown {
	
	public static int fibo(int [] arr, int n) {
		if(arr[n] ==0) {
			if(n<2) {
				arr[n] = n; 
			}else {
				int left = fibo(arr,n-1);
				int right = fibo(arr, n-2);
				arr[n] = left+right;
			}
		}
		
		return arr[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nth fibonachi number");
		int d = sc.nextInt();
		
		System.out.println("The " +d+ "th fibonachi number is");
		
		System.out.println(fibo(new int[d+1], d));

	}

}

