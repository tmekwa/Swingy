package gui.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.views.CreateHeroGUIView;
import gui.views.CreateOrChooseGUIView;

public class CreateOrChooseGUIController
{
    private CreateOrChooseGUIView _view;
    public CreateOrChooseGUIController(CreateOrChooseGUIView view)
    {
        this._view = view;

        this._view.createHeroListener(new CreateHeroListener());
        this._view.selectHeroListener(new SelectHeroListener());
        this._view.switchToConsoleListener(new SwitchToConsoleListener());
    }

    public void exitWindow()
    {
      this._view.dispose();
    }

    private class CreateHeroListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Create new hero btn clicked");
        CreateHeroGUIView createHeroView = new CreateHeroGUIView();
        createHeroView.setVisible(true);
        exitWindow();

        CreateHeroGUIController createHero = new CreateHeroGUIController(createHeroView);
      }
    }
    
    private class SelectHeroListener implements ActionListener
    {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Select hero btn clicked");
		}
        
    }

    private class SwitchToConsoleListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Switch to console btn clicked");
      }
        
    }
}