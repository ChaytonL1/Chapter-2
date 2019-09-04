import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {

        double singleEggs;
        double singleEggsPrice;
        double dozenEggsPrice;
        double dozenEggs;
        int userInput;
        final double DOZEN_EGGS = 12;

        Scanner input = new Scanner(System.in);
        System.out.println( " How many eggs do you want? >>>");
        userInput = input.nextInt();

        dozenEggs = userInput / DOZEN_EGGS;
        singleEggs = userInput % DOZEN_EGGS;

        dozenEggsPrice = dozenEggs * 3.25;
        singleEggsPrice = singleEggs * .45;






    }
}
