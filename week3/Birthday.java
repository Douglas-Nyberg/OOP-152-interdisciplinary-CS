
public class Birthday{// Extremely inspired by program 1.4.2 the Coupon Collector Simulation.
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double trials = Double.parseDouble(args[1]);

        int[] birthdayCounter = new int[n+2];
        for (int i = 0; i < trials; i++)
        {
            boolean[] birthdayCollector = new boolean[n+1];
            int count = 0;
            boolean dupBirthday = false;

            while(dupBirthday == false)
            {
                int randomBirthday = (int) (Math.random() * n);
                count++;
                if (birthdayCollector[randomBirthday] == true)
                {
                    birthdayCounter[count] += 1;
                    dupBirthday = true;
                }
                else
                {
                    birthdayCollector[randomBirthday] = true;
                }
            }
        }
        int j = 1;
        double totalCount = 0.0;
        double fraction = 0.0;
        while (fraction < .5)
        {
            totalCount += birthdayCounter[j];
            fraction = totalCount / trials;
            System.out.println(j + "\t" + birthdayCounter[j] + "\t" + fraction);
            j++;
        }
    }
}
