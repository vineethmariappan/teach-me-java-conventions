package powerpackage;


import org.junit.Test;
import org.junit.Assertions;
import static org.junit.Assert.assertEquals;
public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        Assertion.assertEquals(Power.find(1,1) == 1);
    }

    @Test
    public void twoRaisedToTwoIsTwo() {
        Assertion.assertEquals(Power.find(2,1) == 2);
    }

    @Test
    public void twoPowerTwoIsFour() {
        Assertion.assertEquals(Power.find(2, 2) == 4);
    }

    @Test
    public void powerOfTwoAndThreeIsSix() {
        Assertion.assertEquals(Power.find(3, 2) == 3*3);
    }
}
