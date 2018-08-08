package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ConditionalAndPracticeOne_Test{
    @Test
    public void checkWeirdSum() {
	ConditionalAndPracticeOne varOne = new ConditionalAndPracticeOne();
	assertTrue(varOne.weirdSum(0,0) == 0);
	assertTrue(varOne.weirdSum(1,2) == 3);
	assertTrue(varOne.weirdSum(7,2) == 9);
	assertTrue(varOne.weirdSum(9,2) == 20);
	assertTrue(varOne.weirdSum(10,9) == 20);
	assertTrue(varOne.weirdSum(10,11) == 21);
	}
}