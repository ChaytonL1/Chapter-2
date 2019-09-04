import java.util.Scanner;

public class NauticalMiles {

    public static void main(String[] args) {

        final double NM_TO_MILE = 1.150779;
        final double NM_TO_KILO = 1.852;
        double UserInputNM;
        double NMToMiles;
        double NMToKilo;

        Scanner input = new Scanner(System.in);
        System.out.println( " How many NM do you want to convert? >>> ");
        UserInputNM = input.nextDouble();

        NMToMiles = NM_TO_MILE * UserInputNM;
        NMToKilo = NM_TO_KILO * UserInputNM;

        System.out.println( " The number of miles in " + UserInputNM + " nautical miles is " + NMToMiles + " miles.");
        System.out.println( " The number of kilometers in " + UserInputNM + " nautical miles is " + NMToKilo + " kilometers.");





    }
}
