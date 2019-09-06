import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {

        double singleEggs;
        double singleEggsPrice;
        double dozenEggsPrice;
        int dozenEggs;
        int userInput;
        double total;
        final int DOZEN_EGGS = 12;

        Scanner input = new Scanner(System.in);
        System.out.println( " How many eggs do you want? >>>");
        userInput = input.nextInt();

        dozenEggs = userInput / DOZEN_EGGS;
        singleEggs = userInput % DOZEN_EGGS;

        dozenEggsPrice = dozenEggs * 3.25;
        singleEggsPrice = singleEggs * .45;
        total = dozenEggsPrice + singleEggsPrice;

        System.out.println(" You ordered " + userInput + " eggs. That's " + dozenEggs + " dozen eggs at $3.25 per dozen, \n" +
                " and " + singleEggs + " loose eggs at $.45 each for a total of $" + total);






    }
}
