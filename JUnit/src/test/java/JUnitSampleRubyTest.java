import org.example.StringCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitSampleRubyTest {
    @Test
    void testStringCalculator(){
        StringCalculator sc = new StringCalculator();
        assertEquals(6,sc.Add("2,4"));
        assertEquals(117,sc.Add("110,7"));
    }
}

