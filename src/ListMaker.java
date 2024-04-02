import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        final String menu = "A - Add, D - Delete, P - Print, Q - Quit";
        String cmd = "";

        boolean done = false;
        do  {
            // display the list
            displayList();
            // display menu options
            // get menu choice
            cmd = SafeInput.getRegExString(console, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();

            // execute choice
            switch(cmd)
            {
                case "A":
                    break;

                case "D":
                    break;

                case "P":
                    break;

                case "Q":
                    System.exit(0);
                    break;
            }

        }while(!done);
    }

    private static void displayList()
    {
        for(int i = 0; i < list.size(); i++)
        {
            
        }
    }
}