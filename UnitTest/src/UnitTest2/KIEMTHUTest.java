package UnitTest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KIEMTHUTest {

  KIEMTHU kt = new KIEMTHU();
    @Test // test chay 1 spham
	void test1SanPham() {
		double soTienMongDoi =500;
		assertEquals(soTienMongDoi,kt.Tong(1,500));
	}
	
	@Test // test chay 2 spham
	void test2SanPham() {
		double soTienMongDoi =1500;
		assertEquals(soTienMongDoi,kt.Tong(2,1500));
	}

	@Test // test chay 3 spham
	void test3SanPham() {
		double soTienMongDoi =1500;
		assertEquals(soTienMongDoi,kt.Tong(3,1500));
	}
	
	@Test // test chay 4 spham
	void test4SanPham() {
		double soTienMongDoi =200;
		assertEquals(soTienMongDoi,kt.Tong(4,200));
	}
	
	@Test // test chay 5 spham // chay true
	void test5SanPham() {
		double soTienMongDoi =180;
		assertEquals(soTienMongDoi,kt.Tong(5,200));
	}
	
	@Test // test chay 5 spham // chay false
	void test5SanPham_1() {
		double soTienMongDoi =200;
		assertEquals(soTienMongDoi,kt.Tong(5,200));
	}
	
	@Test // test chay 6 spham // chay true // du 2 // chay true
	void test6SanPham() {
		double soTienMongDoi =170;
		assertEquals(soTienMongDoi,kt.Tong(6,200));
	}
	
	@Test // test chay 7 // du 3
	void test7SanPham() {
		double soTienMongDoi =160;
		assertEquals(soTienMongDoi,kt.Tong(7,200));
	}
	
	@Test // test chay 8 // nhan 2 giam gia khong du
	void test8SanPham() {
		double soTienMongDoi =200;
		assertEquals(soTienMongDoi,kt.Tong(8,200));
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
