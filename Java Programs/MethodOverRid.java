class Animal {
	public void makeSound(){
		System.out.println("Animals barks very loudly");
		}
}

class Dog extends Animal{
	@Override
	public void makeSound(){
	System.out.println("Dog Barks");
	}
}

class MethodOverRid {
	public static void main(String[] args){
	Dog dogobj = new Dog();
	Animal animalobj = new Animal();
	dogobj.makeSound();
	
	animalobj.makeSound();
	}
}