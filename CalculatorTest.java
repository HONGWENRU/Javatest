import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    private Calculator c;

    @Before
    public void setUp() throws Exception {
        c = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        assertEquals(10, c.add(5, 5));
    }

    @Test
    public void testSqe() {
        assertEquals(4.0, c.sqe(16), .1);
    }
}