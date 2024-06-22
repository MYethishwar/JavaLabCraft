class Shape {
	public int x,y;
	void printArea(){
		System.out.println("Prints the area of the shape");
	}
}

class Rectangle extends Shape {
	void printArea() {
		System.out.println("Area of rectangle is "+x*y);
	}
}

public class Overrid {
	public static void main(String[] args){
	Rectangle r=new Rectangle();
	r.x = 5;
	r.y = 10;
	r.printArea();
	}
}