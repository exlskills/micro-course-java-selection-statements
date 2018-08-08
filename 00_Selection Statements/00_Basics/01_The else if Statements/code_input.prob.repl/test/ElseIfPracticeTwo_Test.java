package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ElseIfPracticeTwo_Test{
    @Test
    public void checkCloseToTen() {
	ElseIfPracticeTwo varOne = new ElseIfPracticeTwo();
	assertTrue(varOne.closeToTen(10,10) == 0);
	assertTrue(varOne.closeToTen(20,0) == 0);
	assertTrue(varOne.closeToTen(-80, 100) == 0);
	assertTrue(varOne.closeToTen(8,9) == 9);
	assertTrue(varOne.closeToTen(11,8) == 11);
	assertTrue(varOne.closeToTen(0,0) == 0);
	}
}