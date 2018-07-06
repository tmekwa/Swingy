package gui.views;

import javax.swing.JFrame;

public class CreateHeroGUIView extends JFrame
{
    public CreateHeroGUIView()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(" Create Hero ");
        this.setSize(700, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
            
        this.init();
    }

    public void init()
    {

    }
}