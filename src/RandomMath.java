import java.util.Scanner;

public class RandomMath {

    public static void main(String[] args)
    {
        final int nbe = (int)(Math.random() * 100);
        System.out.println("Please enter a number: ");
        
        Scanner s = new Scanner(System.in);
        int nbScanner = s.nextInt();

        int i = 0;
        int nbMax = 5;
        boolean find = false;

        while ((!find) && (i< nbMax))
        {
            if (nbScanner == nbe)
            {
                System.out.println("Found in: " + i + " attempts");
                find = true;
            }
            else
            {
                if (nbScanner > nbe)
                    System.out.println("The number sought is less than : " + nbScanner);

                if (nbScanner < nbe)
                    System.out.println("The number sought is greater than: " + nbScanner);
                i++;

                System.out.println("Try Again, please enter a number: ");
                nbScanner = s.nextInt();
            }
        }
        System.out.println("Lost ! you are big shit !");
    }
}
