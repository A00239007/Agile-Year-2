import java.util.Scanner;

/**
 * Created by admin2 on 25/10/2016.
 */
public class LightSwitch
{
    private boolean on = false;
    private boolean working = true;

    public LightSwitch()
    {

    }

    public void switchOn()
    {
        if (!on)
        {
            on = true;

        }
    }

    public void switchOff()
    {
        if (on)
        {
            on = false;
        }
    }

    public boolean status()
    {
        return on;
    }

    public boolean working()
    {
        return working;
    }


    public static void main(String [] args)
    {
        LightSwitch l = new LightSwitch();

        while (l.working())
        {
            if(l.status())
            {
                System.out.println("The Light is on");
            }
            else
            {
                System.out.println("The Light is off");
            }

            Scanner sc = new Scanner(System.in);
            String s =  sc.next();

            if(s.equals("+"))
            {
                l.switchOn();
            }
            else if (s.equals("-"))
            {
                l.switchOff();
            }
            else
            {
                System.out.println("Please enter a + or a -");
            }

		 if (Math.random() < 0.5) {
                working = false;
            }

        }

        System.out.print("The Light has blown");
    }

}
