package gui.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import enumeration.ArmorType;
import enumeration.CharacterType;
import enumeration.HelmType;
import enumeration.WeaponType;
import gui.models.HeroModel;

public class CreateHeroGUIView extends JFrame
{
    private JTextField  _txtHeroName;
    private JTextField  _txtHeroLevel;
    private JTextField  _txtHeroXPoints;
    private JTextField  _txtHeroAttack;
    private JTextField  _txtHeroDefense;
    private JTextField  _txtHeroHitPoints;
    private JComboBox  _txtHeroWeapon;
    private JComboBox  _txtHeroArmor;
    private JComboBox  _txtHeroHelm;
    private JComboBox  _txtHeroType;
    private JButton     _btnCreateHero;
    private JButton     _btnSelectImg;
    private JButton     _btnBack;
    

    public CreateHeroGUIView()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(" Create Hero ");
        this.setSize(700, 650);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
            
        this.init();
    }

    public void init()
    {
        JLabel lblHeroName = new JLabel("Name: ");
        JLabel lblHeroType = new JLabel("Type: ");
        JLabel lblXPoints = new JLabel("X Points: ");
        JLabel lblHeroLevel = new JLabel("Level: ");
        JLabel lblAttack = new JLabel("Attack: ");
        JLabel lblDefense = new JLabel("Defense: ");
        JLabel lblHitPoints = new JLabel("Hit Points: ");
        JLabel lblWeapon = new JLabel("Weapon: ");
        JLabel lblArmor = new JLabel("Armor: ");
        JLabel lblHelm = new JLabel("Helm: ");
        JPanel pnlHeading = new JPanel();
        JPanel pnlMain1 = new JPanel();
        JPanel pnlMain2 = new JPanel();
        JPanel pnlBottom = new JPanel();
        JLabel header = new JLabel("Create new hero");
        header.setFont(new Font("Papyrus", Font.PLAIN, 30)); 

        this.setLayout(null);
        pnlMain1.setLayout(null);
        pnlMain2.setLayout(null);
        pnlBottom.setLayout(null);
        this._btnCreateHero = new JButton("Create");
        this._btnBack = new JButton("Back");
        this._btnSelectImg = new JButton("Choose Icon");
        this._txtHeroName = new JTextField(10);
        this._txtHeroXPoints = new JTextField(10);
        this._txtHeroLevel = new JTextField(10);
        this._txtHeroAttack = new JTextField(10);
        this._txtHeroDefense = new JTextField(10);
        this._txtHeroHitPoints = new JTextField(10);
        this._txtHeroWeapon = new JComboBox<WeaponType>(WeaponType.values());
        this._txtHeroArmor = new JComboBox<ArmorType>(ArmorType.values());
        this._txtHeroHelm = new JComboBox<HelmType>(HelmType.values());
        this._txtHeroType = new JComboBox<CharacterType>(CharacterType.values());

        
        this._txtHeroLevel.setText("1");
        this._txtHeroLevel.setEnabled(false);
        this._txtHeroXPoints.setText("0");
        this._txtHeroXPoints.setEnabled(false);
        this._txtHeroAttack.setText("15");
        this._txtHeroAttack.setEnabled(false);
        this._txtHeroDefense.setText("5");
        this._txtHeroDefense.setEnabled(false);
        this._txtHeroHitPoints.setText("15");
        this._txtHeroHitPoints.setEnabled(false);

        this._txtHeroArmor.setEnabled(false);
        this._txtHeroWeapon.setEnabled(false);
        this._txtHeroHelm.setEnabled(false);

        pnlHeading.add(header);

        pnlMain1.add(lblHeroName);
        pnlMain1.add(lblHeroType);
        pnlMain1.add(lblXPoints);
        pnlMain1.add(lblHeroLevel);
        pnlMain1.add(lblAttack);
        pnlMain1.add(lblDefense);
        pnlMain1.add(lblHitPoints);
        pnlMain1.add(lblWeapon);
        pnlMain1.add(lblArmor);
        pnlMain1.add(lblHelm);
        
        pnlMain2.add(this._txtHeroName);
        pnlMain2.add(this._txtHeroType);
        pnlMain2.add(this._txtHeroXPoints);
        pnlMain2.add(this._txtHeroLevel);
        pnlMain2.add(this._txtHeroAttack);
        pnlMain2.add(this._txtHeroDefense);
        pnlMain2.add(this._txtHeroHitPoints);
        pnlMain2.add(this._txtHeroWeapon);
        pnlMain2.add(this._txtHeroArmor);
        pnlMain2.add(this._txtHeroHelm);
        
        pnlBottom.add(this._btnCreateHero);
        pnlBottom.add(this._btnSelectImg);
        pnlBottom.add(this._btnBack);
        
        /*Set bounds for JFrame attributes
         */

        //Labels set bounds
        lblHeroName.setBounds(20, 0, 80, 40);
        lblHeroType.setBounds(20, 50, 80, 40);
        lblXPoints.setBounds(20, 100, 80, 40);
        lblHeroLevel.setBounds(20, 150, 80, 40);
        lblAttack.setBounds(20, 200, 80, 40);
        lblDefense.setBounds(20, 250, 80, 40);
        lblHitPoints.setBounds(20, 300, 80, 40);
        lblWeapon.setBounds(20, 350, 80, 40);
        lblArmor.setBounds(20, 400, 80, 40);
        lblHelm.setBounds(20, 450, 80, 40);

        //TextField set bounds
        this._txtHeroName.setBounds(20, 0, 250, 40);
        this._txtHeroType.setBounds(20, 50, 250, 50);
        this._txtHeroXPoints.setBounds(20, 100, 250, 40);
        this._txtHeroLevel.setBounds(20, 150, 250, 40);
        this._txtHeroAttack.setBounds(20, 200, 250, 40);
        this._txtHeroDefense.setBounds(20, 250, 250, 40);
        this._txtHeroHitPoints.setBounds(20, 300, 250, 40);
        this._txtHeroWeapon.setBounds(20, 350, 250, 50);
        this._txtHeroArmor.setBounds(20, 400, 250, 50);
        this._txtHeroHelm.setBounds(20, 450, 250, 50);

        //Buttons set bounds
        this._btnCreateHero.setBounds(300, 10, 150, 40);
        this._btnSelectImg.setBounds(100, 10, 150, 40);
        this._btnBack.setBounds(500, 10, 150, 40);

        //Panels set bounds
        pnlHeading.setBounds(0, 0, this.getWidth(), 50);
        pnlMain1.setBounds(0, 50, this.getWidth() / 2, 500);
        pnlMain2.setBounds(this.getWidth() / 2, 50, this.getWidth() / 2, 500);
        pnlBottom.setBounds(0, 550, this.getWidth(), 50);

        //Adding panels to JFrame
        this.add(pnlHeading);
        this.add(pnlMain1);
        this.add(pnlMain2);
        this.add(pnlBottom);
    }

    public void createHeroBtn(ActionListener listener)
    {
        this._btnCreateHero.addActionListener(listener);
    }

    public void backBtn(ActionListener listener)
    {
        this._btnBack.addActionListener(listener);
    }

    public void selectIconBtn(ActionListener listener)
    {
        this._btnSelectImg.addActionListener(listener);
    }
}