public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int i = 0;
        int j = 0;
        int steps = 0;
        System.out.println("(0, 0)");
        double random;
        while ((Math.abs(i) + Math.abs(j)) < r) {
            random = Math.random();
            if (random <= 0.25) i++;
            else if (random <= 0.5) i--;
            else if (random <= 0.75) j++;
            else j--;
            steps = steps + 1;
            System.out.println("(" + i + ", " + j + ")");

        }
        System.out.println("steps = " + steps);

    }
}
