public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        double trials = Double.parseDouble(args[1]);
        double steps = 0;


        for (int x = 0; x < trials; x++) {
            int i = 0;
            int j = 0;
            double random;

            while ((Math.abs(i) + Math.abs(j)) < r) {
                random = Math.random();
                if (random <= 0.25) i++;
                else if (random <= 0.5) i--;
                else if (random <= 0.75) j++;
                else j--;

                steps = steps + 1;
            }
        }

        double avgSteps = (steps) / (trials);
        System.out.println("average number of steps = " + avgSteps);
    }


}

