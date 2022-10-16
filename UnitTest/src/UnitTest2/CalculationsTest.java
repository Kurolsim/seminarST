package UnitTest2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
//import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameters;

class CalculationsTest {
	
	@Test //throw exception 1 so chia cho 0
	public void testMath() throws Exception {
		System.out.println("Dang lam test dau tien ");
		Calculations.divide(1, 0);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {10, -10, 0, 3, 2, 8, Integer.MAX_VALUE}) //7 cases
	public void testMultipleTime(int num) throws Exception {
		Calculations.divide(10, num);
		System.out.println(10/num);
	}
	
	@BeforeEach //bat dau moi test
	public void setup() {
		System.out.println("Bat dau test");
	}
	 
	@AfterEach //ket thuc moi test
	public void end() {
		System.out.println("Ket thuc test");
	}
	
	@BeforeAll
	static void setupAll() {
		System.out.println("Bat dau test Unit...");
	}
	
	@AfterAll
	static void endAll() {
		System.out.println("Ket thuc test Unit");
	}
	
	
	
}
