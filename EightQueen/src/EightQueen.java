import java.util.Scanner;

public class EightQueen{
    static final int N = 4;
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int n = Integer.valueOf(c.nextLine());
        Integer[][] board = new Integer[n][n];
        eightQueen(board, 1);
    }

    private static void eightQueen(Integer[][] board, int k) {

    }
    //輸出答案
    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }
    //測試同一行的其子 以及左上 左下是否有皇后
    boolean isSafe(int[][] board, int r, int c){
        int i, j;
        //
        for(i = 0; i < c; i++){
            if(board[r][i]==1) return false;
        }
        for(i = r, j = c; i >= 0 && j >= 0; i--, j--){
            if(board[i][j]==1) return false;
        }
        for(i = r, j = c; i < N  && j >= 0; i++, j--){
            if(board[i][j]==1) return false;
        }
        return true;
    }
}