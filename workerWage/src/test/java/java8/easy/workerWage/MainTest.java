package java8.easy.workerWage;
import static java8.easy.workerWage.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testConvertToTwoDecimalPlace() throws Exception{
		yakshaAssert(currentTest(),Main.convertToTwoDecimalPlace(9866.7389).equals("9866.74")?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),Main.convertToTwoDecimalPlace(9234).equals("9234.00")?"true":"false",businessTestFile);
	}

}
