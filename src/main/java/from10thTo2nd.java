import java.text.DecimalFormat;

public class from10thTo2nd implements Converter{

    public static String convert(Double tenth){

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        return decimalFormat.format(tenth);

    }

}
