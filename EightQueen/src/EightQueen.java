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
    //��X����
    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }
    //���զP�@�檺��l �H�Υ��W ���U�O�_���ӦZ
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