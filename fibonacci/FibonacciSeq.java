package fibonacci;
import java.util.Scanner;
/* Enter a number and have the program generate the Fibonacci Sequence to that number. */
public class FibonacciSeq {
	private static int f(int n) {
	 if(n==2 || n==1)
		return 1;
	 return f(n-1)+f(n-2);
 }
	public static void main(String args[]){
		System.out.println("Enter a # to generate a fibonacci sequence to that #:\n");
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n=in.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.println(f(i)+",");
			}
				
		}
		
		
	}
	

}
