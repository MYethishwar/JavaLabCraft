class DefExcepHandler{
	public static void main(String[] args){
		try{

			int data=50/0;
			System.out.println(data);
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("parent class exceptionhandles"+e);
		}
	}
}