public class StudentImp {
	public static void main(String[] args){
		Student s = new Student("Yethish","97");
		s.display();
	}
}

class Student{
	String nam,rn;
	Student(String name,String rno){
	nam = name;
	rn = rno;
	}
}

public void display(){
	System.out.printf("Welcome %s rno is %s \n",nam,rn);
}