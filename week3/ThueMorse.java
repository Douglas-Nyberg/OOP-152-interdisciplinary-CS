public class ThueMorse {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int[] thue = new int[n];

        //Constructing Thue-Morse sequence.
        for (int i = 0; i<n; i++){//Inspiration from FAQ section of assignment, "How should I construct the Thue-Morse sequence of length n?"
            if (i == 0) thue[i] = 0;
            else if (i % 2 == 0) thue[i] = thue[i/2];
            else thue[i] = (1-thue[i-1]);
            }


        for (int i = 0; i < n; i++){//Printing Thue-Morse Weave.
            for(int j = 0; j < n; j++){
                if (thue[i] == thue[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }

        }
    }


