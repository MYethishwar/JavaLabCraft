class Student{
	//Instance variables
	String name;
	int rollno;
	String branch;
	
	//Object initializing
	Student(String name, int rollno, String branch){
	 this.name = name;
	 this.rollno = rollno;
	 this.branch = branch;
	}
	
	//method to display info
	void  displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollno);
		System.out.println("Branch: "+branch);
	}
}

public class ClassObject {
	public static void main(String[] args){
	Student s1 = new Student("Yethishwar", 97, "Ai&DS");
	Student s2 = new Student("Chintu", 100, "CSE");
	s1.displayInfo();
	s2.displayInfo();
}
}

