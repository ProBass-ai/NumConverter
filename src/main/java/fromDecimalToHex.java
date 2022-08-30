
public class fromDecimalToHex implements Converter{

    /**
     * We take the decimal number, divide it by 16, and then keep dividing the remainder by 16 until we get a quotient of
     * zero
     *
     * @param decimal the decimal number to convert
     * @return The hexadecimal representation of the decimal number.
     */
    public static String convert(int decimal){

        int remainder;
        StringBuilder hex= new StringBuilder();
        char[] hexchars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (decimal > 0) {
            remainder = decimal % 16;
            hex.insert(0, hexchars[remainder]);
            decimal = decimal/16;
        }

        return hex.toString();
    }

}
