class InvalidAgeException extends Exception{
  public Invalid Age Exception(String message){
    super(message);
	}
	}
	public class ExceptionHandlingDemo{
	public static void validateAge(int age)throws InvalidAgeException{
	   if(age<18){
	   throw new InvalidAgeException("Access denied :you must be at least 18 years old.");
	   }else{
	   System.out.println("access granted:Age verified.");
	   }
	   }
	   public static void main(string[]args){
	    int[]userAge:userAges={21,15};
	   for(int age:userAges){
		   System.out.println("\nChecking age:"+age);
		   try{
			   validateAge(age);
			   Exception(ArithmeticException)
			   id(age==21){
				   int result=10/0;
			   }
		   }
		   catch(InvalidAgeException e){
			   System.out.println("Custom Exception Caught:"+e.getMessage());
		   }
		   catch(ArithmeticException e){
			   System.out.println(Run imException Caught:Cannot divide by zero.");
		   }
		   catch(Exception e){
			   System.out.println("GeneralException Caught:"+e.getMessage());
		   }finally{
			   System.out.println("Cleanup:Age check processing completed.");
		   }
	   }
	   }
	}






