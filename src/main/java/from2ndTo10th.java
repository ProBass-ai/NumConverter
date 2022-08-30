import java.text.DecimalFormat;


public class from2ndTo10th implements  Converter {

    public static String convert(double secnd){

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(10);

        return decimalFormat.format(secnd);

    }

}
