class ChekExcep {
	public static void main(String[] args){
		String className = "ChekdExcep";

	try {
Class<?> clz = Class.forName(className);
	System.out.println("Class loaded successfully: " +clz.getName());
	}
	catch(ClassNotFoundException e){
		System.err.println("class not found: "+ className);
		}
	}
}