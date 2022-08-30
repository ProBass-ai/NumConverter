import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class unittest {

    @Test
    public void test10thTo2nd(){

        assertEquals("10,12", from10thTo2nd.convert(10.1234567891));

    }


    @Test
    public void test2ndTo10th(){

        assertEquals("10,55", from2ndTo10th.convert(10.55));

    }


    @Test
    public void testDecimalToHex(){

        assertEquals("468", fromDecimalToHex.convert(1128));
        assertEquals("1", fromDecimalToHex.convert(1));
        assertEquals("BC", fromDecimalToHex.convert(188));


    }


}
