package pl.edu.agh.qualitycalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
public class CalculationsVerbalizerTest {
    CalculationsVerbalizer calculationsVerbaizerUnderTest;
    @Before
    public void setUp() {
        calculationsVerbaizerUnderTest = new CalculationsVerbalizer();
    }
    @Test
    public void testVerbalizeTwoArgs() throws Exception {
        String expectedMessage="1.0 plus 2.0 gives value 3.0";
        assertEquals(expectedMessage,calculationsVerbaizerUnderTest.verbalize(Operation.SUM,1,2, 3),expectedMessage);
    }
    @Test
    public void testVerbalizeThreeArgs() throws Exception {
        String expectedMessage="Average of 1.0, 2.0, 3.0 gives value 2.0";
        assertEquals(expectedMessage,calculationsVerbaizerUnderTest.verbalize(Operation.AVERAGE,1,2,3,2),expectedMessage);
                //   assertEquals(2, calculationsUnderTest.calculate(Operation.SUBTRACT, 5, 3, 0), 0.01);
    }
    @After
    public void tearDown() {
    }
}
