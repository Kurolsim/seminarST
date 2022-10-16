package UnitTest2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ bt_1Test.class, CalculationsTest.class, KIEMTHUTest.class })
public class AllTests {
	
}