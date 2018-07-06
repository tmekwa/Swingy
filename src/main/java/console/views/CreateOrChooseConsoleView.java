package console.views;

import java.util.Scanner;

import gui.controllers.CreateOrChooseGUIController;
import gui.views.CreateOrChooseGUIView;

public class CreateOrChooseConsoleView
{
    public CreateOrChooseConsoleView()
    {
        createChoosePrompt();
    }

    public void createChoosePrompt()
    {
        int choice;
        Scanner prompt = new Scanner(System.in);
        
        System.out.println("Welcome back to the city. I hope you enjoyed your vacation and didn’t end up with too much of a sunburn.");
        System.out.println("\n1. Choose from existing Heros" + "\n2. Create a new Hero" + "\n3. Switch to Graphical User Interface");
        choice = prompt.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Choose your hero");
                break;
            case 2:
                System.out.println("Create a hero");
                break;
            case 3:
                System.out.println("Switching to GUI mode:");
                CreateOrChooseGUIView guiChoose = new CreateOrChooseGUIView();
                guiChoose.setVisible(true); 
                new CreateOrChooseGUIController(guiChoose);
                break;
            default:
                break;
        }
    }
}