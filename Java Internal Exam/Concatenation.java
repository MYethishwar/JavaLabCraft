import java.util.*;
class Concatenation {
	public static void main(String[] args){
	String str1 = "My name is ";
	String str2 = "I am studying in ";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your name:");
	String name = sc.next();
	String my_name = str1.concat(name);
	System.out.println("Enter your college name:");
	String college = sc.next();	
	String result = str2 + " " + college;
	System.out.printf("Here is %s Details",+name);
	System.out.println(my_name);
	System.out.println(result);
	}
}
	
	
	
	