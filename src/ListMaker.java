import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // Menu
        final String menu = "A - Add, D - Delete, P - Print, Q - Quit";
        String cmd = "";
        String add = "";
        int delete;

        boolean done = false;
        do  {
            // display the list
            displayList();
            // get menu choice
            cmd = SafeInput.getRegExString(console, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();

            // execute choice
            switch(cmd)
            {
                case "A":   //Add
                    // Prompt user for list item
                    add = SafeInput.getNonZeroLenString(console, "Enter your value to add");
                    // Add to list
                    list.add(add);
                    break;

                case "D":   //Delete
                    // Prompt for number of item to delete
                    delete = SafeInput.getRangedInt(console, "Which value would you like to delete? ", 1, list.size());
                    // Translate number to index (i-1)
                    delete = delete - 1;
                    // Delete item
                    list.remove(delete);
                    break;

                case "P":   //Print
                    break;

                case "Q":   //Quit
                    // Confirms that user wants to quit
                    done = SafeInput.getYNConfirm(console, "Are you sure?");
                    if (done == true)
                        System.exit(0);
                    break;
            }

        }while(!done);
    }

    private static void displayList()
    {
        //Checks if list is empty
        if(list.size() != 0)
        {
            //Prints list if it is not
            System.out.println("**********************************");
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%3d%15s" , i + 1, list.get(i));
                System.out.println();
            }
            System.out.println("**********************************");
        } else
        {
            //Prints list is empty if list is empty
            SafeInput.prettyHeader("List is Empty");
        }

    }
}