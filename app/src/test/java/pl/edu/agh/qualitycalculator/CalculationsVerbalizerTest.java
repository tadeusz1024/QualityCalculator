package pl.edu.agh.qualitycalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.MissingFormatArgumentException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

public class CalculationsVerbalizerTest {
    CalculationsVerbalizer calculationsVerbaizerUnderTest;
    String expectedMessage;
    @Before
    public void setUp() {
        calculationsVerbaizerUnderTest = new CalculationsVerbalizer();
    }
    @Test
    public void testVerbalizeTwoArgsSum() throws Exception {
        expectedMessage="1.0 plus 2.0 gives value 3.0";
        assertEquals(expectedMessage,calculationsVerbaizerUnderTest.verbalize(Operation.SUM,1,2, 3),expectedMessage);
    }
    @Test
    public void testVerbalizeTwoArgsSubtrac() throws Exception {
        expectedMessage="3.0 minus 2.0 gives value 1.0";
        assertEquals(expectedMessage,calculationsVerbaizerUnderTest.verbalize(Operation.SUBTRACT,3,2, 1),expectedMessage);
    }
    @Test
    public void testVerbalizeTwoArgsMultiply() throws Exception {
        expectedMessage="6.0 multiplied by 2.0 gives value 12.0";
        assertEquals(expectedMessage,calculationsVerbaizerUnderTest.verbalize(Operation.MULTIPLY,6,2, 12),expectedMessage);
    }
    @Test
    public void testVerbalizeTwoArgsDivide() throws Exception {
        expectedMessage="12.0 divided by 3.0 gives value 4.0";
        assertEquals(expectedMessage,calculationsVerbaizerUnderTest.verbalize(Operation.DIVIDE,12,3, 4),expectedMessage);
    }
    @Test
    public void testVerbalizeThreeArgs() throws Exception {
        expectedMessage="Average of 1.0, 2.0, 3.0 gives value 2.0";
        assertEquals(expectedMessage,calculationsVerbaizerUnderTest.verbalize(Operation.AVERAGE,1,2,3,2),expectedMessage);
    }
    @After
    public void tearDown() {
    }
}
