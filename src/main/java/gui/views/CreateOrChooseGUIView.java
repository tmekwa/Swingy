package gui.views;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreateOrChooseGUIView extends JFrame
{
    private JButton _switchToConsole;
    private JButton _createHero;
    private JButton _selectHero;

    public CreateOrChooseGUIView()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(" Great Welcome Player ");
        this.setSize(700, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
            
        this.init();
    }

    public void init()
    {
        //Button instances
        this._switchToConsole = new JButton("Go Console");
        this._createHero = new JButton("Create Hero");
        this._selectHero = new JButton("Select Hero");

        JPanel pnlMain = new JPanel();
        JPanel pnlBottom = new JPanel();
        pnlMain.setLayout(null);

        pnlBottom.add(this._selectHero);
        pnlBottom.add(this._createHero);
        pnlBottom.add(this._switchToConsole);

        pnlMain.setBackground(new Color(22, 22, 22));
        
        pnlBottom.setBounds(0, this.getHeight() - 70, this.getWidth(), 60);
        
        pnlMain.add(pnlBottom);
        
        pnlMain.setBounds(0, 0, this.getWidth(), this.getHeight() - 60);
    
        this.add(pnlMain);
    }

    public void switchToConsoleListener(ActionListener listener)
    {
        this._switchToConsole.addActionListener(listener);
    }

    public void createHeroListener(ActionListener listener)
    {
        this._createHero.addActionListener(listener);
    }

    public void selectHeroListener(ActionListener listener)
    {
        this._selectHero.addActionListener(listener);
    }
}