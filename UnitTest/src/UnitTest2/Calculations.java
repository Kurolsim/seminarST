package UnitTest2;

public class Calculations {
	public static int divide(int num1, int num2 ) throws Exception {
	    if (num2 == 0) {
	      throw new ArithmeticException("divide by zer0");
	    }
	    return num1/num2;
	}
}
