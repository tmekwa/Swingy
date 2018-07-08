import java.util.Random;

public class RandomGen
{
    public static void main(String [] args)
    {
        Random ran = new Random();

        int n  = ran.nextInt(2) + 1;

        System.out.println(n);
    }
}