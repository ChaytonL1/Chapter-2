import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        String color;
        String wordEst;
        String bodyPart;

        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color >>>");
        color = input.nextLine();
        System.out.print("Enter a Word ending in EST >>>");
        wordEst = input.nextLine();
        System.out.print("Enter a plural body part >>>");
        bodyPart = input.nextLine();


        System.out.println("The " + color + " Dragon is the " + wordEst + " Dragon of all. ");
        System.out.println("He has 12 " + bodyPart);
    }
}
