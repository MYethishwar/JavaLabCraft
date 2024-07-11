import java.util.Scanner;
class Comparision{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a programming language that you know");	
		String input_string = sc.next();
		String predefined_string = "Java";
		if(input_string.equals(predefined_string))
			{
			System.out.println("You strings are matched");			}
		else
			{
			System.out.println("Sorry Your strings aren't matched");	
			}

			sc.close();
		}
}
		