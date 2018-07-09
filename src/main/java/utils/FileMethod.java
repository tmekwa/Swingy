package utils;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import factories.HeroFactory;
import gui.models.HeroModel;

public class FileMethod
{
    static FileWriter fw = null;
    static BufferedWriter bw = null;
    static PrintWriter out = null;
    private HeroModel _hero;
    public static String FileName = "hero-stats.txt";
    public static String SimulationOutputName = "simulation-output.txt";
    private static List<HeroModel> _heroList;

    public static List<HeroModel>  simulateFile()
    {
        List<HeroModel> heroList = new ArrayList<HeroModel>();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(FileName));
            String line = "";
            if (line != null)
            {
                while((line = reader.readLine()) != null)
                {   
                    try 
                    {
                       if (line.trim().length() > 0){
                        HeroModel iHero = HeroFactory.newHero(line.split(",")[0], line.split(",")[1], Integer.parseInt(line.split(",")[2]), Integer.parseInt(line.split(",")[3]), Integer.parseInt(line.split(",")[4]),
                        Integer.parseInt(line.split(",")[5]), Integer.parseInt(line.split(",")[6]), line.split(",")[7], line.split(",")[8], line.split(",")[9], line.split(",")[10]);
                    
                        heroList.add(iHero); 
                       }
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Number badly formatted");
                    }
                    //System.out.println(line);
                }
            }
        }catch(IOException e)
        {
            System.out.println("Cannot find file" + e);
        }
        return (heroList);
    }
    
    public static void readFile()
    {
        try
        {
            File file = new File("hero-stats.txt");

            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String str;

            while((str = buffer.readLine()) != null)
            {
                String []heroStat;
                
                System.out.println(str);
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void writeToFile(HeroModel _hero)
    {
        try
        {
                _heroList = simulateFile();
                fw = new FileWriter(FileName, true);
                bw = new BufferedWriter(fw);
                out = new PrintWriter(bw);
                //out.println("");
                out.println(_hero.getName() + "," + _hero.getType() + "," + _hero.getLevel() + "," + _hero.getXPoints() + "," + _hero.getAttack() +  "," 
                + _hero.getDefense() + "," + _hero.getHitPoints() + "," + _hero.getWeapon() + "," + _hero.getArmor() + "," + _hero.getHelm() + "," + _hero.getIcon());
                out.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(String filename, String str, Boolean append){
        try
        {
            fw = new FileWriter(filename, append);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            out.write(str);
            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findAndUpdate(List<HeroModel> _heroList, HeroModel _hero){
        try
        {
            File _file = new File(FileName);
            fw = new FileWriter(FileName);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            out.print("");
            for (HeroModel hero : _heroList) {
                if (_hero.getName().equalsIgnoreCase(hero.getName())){
                    writeToFile(_hero);    
                }else{
                    writeToFile(hero);
                }
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }   
    }
}