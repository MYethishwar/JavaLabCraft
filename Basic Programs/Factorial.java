import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		int f = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++){
			f *=  i;
		}
		System.out.printf("Factorial of %d is %d",n,f);
	}
}