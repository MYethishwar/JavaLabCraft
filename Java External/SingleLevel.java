class Parent {
	void displayParent(){
		System.out.println("Hey Programmer i'am in the Parent Class");
		}
}

class Child extends Parent {
	void displayChild() {
	System.out.println("Hey Programmer i'am in the Child Class");
	}
}

public class SingleLevel {
	public static void main(String[] args){
		Child obj = new Child();
		obj.displayChild();
		obj.displayParent();
			}
}

