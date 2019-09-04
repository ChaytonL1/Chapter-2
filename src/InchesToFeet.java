import java.util.Scanner;

public class InchesToFeet {

    public static void main(String[] args) {

        int numFeet;
        final int INCHES_TO_FEET = 12;
        int userInput;
        int inchesRemainder;


        Scanner input = new Scanner(System.in);
        System.out.println(" How many inches would you like to convert to feet? >>> ");
        userInput = input.nextInt();

        numFeet = userInput / INCHES_TO_FEET;
        inchesRemainder = userInput % INCHES_TO_FEET;

        System.out.println( + userInput + " Inches converts to " + numFeet + " feet and " + inchesRemainder + " inches remaining ");

    }


}
