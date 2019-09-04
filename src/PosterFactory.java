import javax.swing.*;

public class PosterFactory {

    public static void main(String[] args){

        int postersbought;
        int boxesfilled;
        int postersleftover;
        final int BOX_LIMIT = 11;
        String postersboughtstring;
        postersboughtstring = JOptionPane.showInputDialog(null, " How many posters ordered today " ,
                JOptionPane.INFORMATION_MESSAGE);
        postersbought = Integer.parseInt(postersboughtstring);

        boxesfilled = postersbought / BOX_LIMIT;
        postersleftover = postersbought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "The number of boxes filled were " +
                boxesfilled + " with " + postersleftover + " posters left over ");

    }
}
