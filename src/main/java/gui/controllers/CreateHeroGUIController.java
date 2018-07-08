package gui.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.views.CreateHeroGUIView;

public class CreateHeroGUIController
{
    private CreateHeroGUIView _view;

    public CreateHeroGUIController(CreateHeroGUIView view)
    {
        this._view = view;

        this._view.createHeroBtn(new CreateHeroBtn());
        this._view.selectIconBtn(new SelectIconBtn());
        this._view.backBtn(new BackBtn());
    }

    class CreateHeroBtn implements ActionListener
    {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Create new hero btn is clicked");
		}

    }

    class BackBtn implements ActionListener
    {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Back btn is clicked");
		}

    }

    class SelectIconBtn implements ActionListener
    {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Select hero icon btn is clicked");
		}

    }
}