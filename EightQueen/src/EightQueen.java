import java.util.Scanner;

public class EightQueen{
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        int n = Integer.valueOf(c.nextLine());
        Integer[][] board = new Integer[n][n];
        eightQueen(board, 1);
    }

    private static void eightQueen(Integer[][] board, int k) {

    }

    boolean isSafe(int[][] board, int k){
        int len = board.length;
        for(int[] i:board){
            
        }
        return true;
    }
}