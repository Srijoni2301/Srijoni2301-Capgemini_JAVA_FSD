package day4;

public class Exception1 {
	public static void main(String[] args) {

	    try {

	      // code that generate exception
	      int divideByZero = 5 / 0;
	      System.out.println("Rest of code in try block" +divideByZero);
	    }
	    
	    catch (ArithmeticException e) {
	      System.out.println("ArithmeticException => " + e.getMessage());
	    }
	  }

}
