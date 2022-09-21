public class Minesweeper {
    public static void main(String[] args){ //Inspired greatly by self-avoiding-random walks
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] minesLocation = new boolean[m+2][n+2];//+2 for edges
        int bombs = 0;
        while (bombs != k){ //places k bombs randomly
                int rm = (int) (1 + (Math.random() * m));
                int rn = (int) (1 + (Math.random() * n));
                if (minesLocation[rm][rn] != true){
                    minesLocation[rm][rn] = true;
                    bombs++;
                }

            }

        int[][] mineCount = new int[m+2][n+2];// +2 for edges
        for (int i = 1; i < m+1; i++) { // this chunk counts adjacent bombs to [i][j]
            for (int j = 1; j < n+1; j++) {
                if (minesLocation[i][j] == false){
                    if (minesLocation[i+1][j] == true) mineCount[i][j] += 1; //right
                    if (minesLocation[i-1][j] == true) mineCount[i][j] += 1; //left
                    if (minesLocation[i][j+1] == true) mineCount[i][j] += 1; //up
                    if (minesLocation[i][j-1] == true) mineCount[i][j] += 1; //down
                    if (minesLocation[i+1][j+1] == true) mineCount[i][j] += 1; //top-right corner
                    if (minesLocation[i-1][j-1] == true) mineCount[i][j] += 1; //bottom-left corner
                    if (minesLocation[i+1][j-1] == true) mineCount[i][j] += 1; //bottom-right corner
                    if (minesLocation[i-1][j+1] == true) mineCount[i][j] += 1; //top-left corner

                }
            }
        }



        for (int i = 1; i < m+1; i++){ //prints minesweeper
            for (int j = 1; j < n+1; j++){
                if (minesLocation[i][j] == true){
                    System.out.print("*  ");
                }else{
                    System.out.print(mineCount[i][j] + "  ");
                }
            }
            System.out.println();
        }





    }
}
