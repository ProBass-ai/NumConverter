import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner;
        String converts;



        scanner = new Scanner(System.in);
        System.out.println("Welcome to the decimal-point converter...");

        System.out.println("Which convertion would you like to perform?");
        System.out.println("1. Decimal to HexaDecimal?");
        System.out.println("2. 10th-Decimal point to 2nd-Decimal point?");
        System.out.println("3. 2nd-Decimal point to 10th-Decimal point?");
        String userIn = scanner.nextLine();
        System.out.println("\n");


        switch (userIn) {

            case "1" -> {

                System.out.print("Enter number to convert: ");
                userIn = scanner.next();

                while (!checkInt(userIn)) {
                    System.out.println("Please Enter a number between 0 and 10000");
                    userIn = scanner.nextLine();
                }


                System.out.println("Converting...");
                converts = fromDecimalToHex.convert(Integer.parseInt(userIn));

                System.out.println("Output: ");
                System.out.println(converts);

            } case "2" -> {

                System.out.print("Enter number to convert: ");
                userIn = scanner.next();

                while (!checkDouble(userIn)){
                    System.out.println("Please Enter a number between 0 and 10000");
                    userIn = scanner.nextLine();
                }


                System.out.println("Converting...");
                converts = from2ndTo10th.convert(Double.parseDouble(userIn));

                System.out.println("Output: ");
                System.out.println(converts);

            }
            case "3" -> {

                System.out.print("Enter number to convert: ");
                userIn = scanner.next();

                while (!checkDouble(userIn)){
                    System.out.println("Please Enter a number between 0 and 10000");
                    userIn = scanner.nextLine();
                }

                System.out.println("Converting...");

                converts = from10thTo2nd.convert(Double.parseDouble(userIn));

                System.out.println("Output: ");
                System.out.println(converts);
            }
        }



    }

    public static boolean checkDouble(String n){
        try{
            return (Double.parseDouble(n) >= 0) && (Double.parseDouble(n) < 100000);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkInt(String n){
        try{
            return (Integer.parseInt(n)) >= 0 && (Integer.parseInt(n) < 100000);
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
