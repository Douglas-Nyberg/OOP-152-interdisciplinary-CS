
public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] Sums = new int[args.length];


        for (int i = 1; i < args.length; i++) {//Parsing array and summing current index to previous index
            if (i > 1) Sums[i] = Integer.parseInt(args[i]) + Sums[i - 1];
            else Sums[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < m; i++) {
            int randomNum = (int) (Math.random() * (Sums[(args.length - 1)]));
            for (int num = 1; num < args.length; num++) {//finds and prints sub-interval based on the randomNum
                if (randomNum >= Sums[num - 1] && randomNum < Sums[num]) System.out.print(num + " ");
            }
        }
    }
}
