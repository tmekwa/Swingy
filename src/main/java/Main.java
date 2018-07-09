import console.views.CreateOrChooseConsoleView;
import gui.controllers.CreateOrChooseGUIController;
import gui.views.CreateOrChooseGUIView;
import utils.FileMethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        FileMethod.readFile();
        if (args.length > 1)
        {
            System.out.println("Missing argument: console or gui");
        }
        else
        {
            try
            {
                if (args[0].equalsIgnoreCase("console"))
                {
                    CreateOrChooseConsoleView consoleChoose = new CreateOrChooseConsoleView();
                    consoleChoose.createChoosePrompt();
                }
                if (args[0].equalsIgnoreCase("gui"))
                {
                    CreateOrChooseGUIView guiChoose = new CreateOrChooseGUIView();
                    guiChoose.setVisible(true); 
                    
                    new CreateOrChooseGUIController(guiChoose);
                }
            }catch(Exception e){
                System.out.println("No arguments passed to the command line");
            }
        }
    }
}
