public class Leap {
    public static void main(String[] args)
    {
        Integer year=2000;
        Boolean leap= false;
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    leap = true;
                }
                else
                {
                    leap = false;
                }
            }
            else
            {
                leap = false;
            }
        }
        if(leap)
            System.out.println("The Given Year is leap year");
        else
            System.out.println("The Given Year is not a Leap Year" );
    }
}
