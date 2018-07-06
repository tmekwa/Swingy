package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileMethods
{
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
}