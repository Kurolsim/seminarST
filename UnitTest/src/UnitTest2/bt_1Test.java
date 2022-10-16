package UnitTest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class bt_1Test {
	/*    @BeforeMethod
	    public void setUpMethod() throws Exception {
	    }

	    @AfterMethod
	    public void tearDownMethod() throws Exception {
	    }*/
	// test getter and setter
	    @Test
	    public void testMain() {
	        bt_1 bt1  = new bt_1();
			String ten = "tien";
			bt1.setHoten("tien");
			assertEquals(ten,bt1.getHoten());
		}
	    // test constructors
	     @Test
	    public void test() {
	        bt_1 bt1  = new bt_1("A21","LONG",2022);
	         assertEquals("LONG",bt1.getNamsinh());
	        }
	      @Test
	    public void test1() {
	        bt_1 bt1  = new bt_1("A21","LONG",2022);
	         assertEquals("LONG",bt1.getHoten());
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

