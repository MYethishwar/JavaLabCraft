import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){
		int sum=0,n,org;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		org = n;
		while(org!=0){
			int rem = org%10;
			sum+=rem*rem*rem;
			org/=10;
		}
		if(sum==n){
		System.out.println("Armstrong Number");
		}
		else{
		System.out.println("Not an Armstrong Number");
		}
	}
}