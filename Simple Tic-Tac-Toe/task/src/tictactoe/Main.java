package tictactoe;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    static int y = 0;
    static int z = 0;
    static boolean testFlag = true;
    static char[][] board = new char[3][3];

    public static  void boardData() {


        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }


    }

    public static void displayBoard(char[][] board) {
        System.out.println("---------");
        for (char[] row : board) {
            System.out.print("| ");
            for (char col : row) {
                System.out.printf("%c ", col);
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
    public static void Move(char[][] arr){

        while (true) {
            String firstint = scanner.next();
            String secondint = scanner.next();
            if (!firstint.matches("-?\\d+(\\.\\d+)?") || !secondint.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("You should enter numbers!");
            }
            int i = Integer.parseInt(firstint);
            int j = Integer.parseInt(secondint);
            if(!(0<i&&i<4)||!(0<j&&j<4)){
                System.out.println("Coordinates should be from 1 to 3!");
            }
            else if(arr[i-1][j-1]!=' '){
                System.out.println("This cell is occupied! Choose another one!");
            }
            else{
                arr[i-1][j-1]='X';
                break;
            }
        }

    }
    public static void Move2(char[][] arr){

        while (true) {
            String firstint = scanner.next();
            String secondint = scanner.next();
            if (!firstint.matches("-?\\d+(\\.\\d+)?") || !secondint.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("You should enter numbers!");
            }
            int i = Integer.parseInt(firstint);
            int j = Integer.parseInt(secondint);
            if(!(0<i&&i<4)||!(0<j&&j<4)){
                System.out.println("Coordinates should be from 1 to 3!");
            }
            else if(arr[i-1][j-1]!=' '){
                System.out.println("This cell is occupied! Choose another one!");
            }
            else{
                arr[i-1][j-1]='O';
                break;
            }
        }

    }
    public static void TextX(char arr[][]){


            if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X') {
                z++;
            } else if (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') {
                z++;
            } else if (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X') {
                z++;
            } else if (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') {
                z++;
            } else if (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') {
                z++;
            } else if (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') {
                z++;
            } else if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
                z++;
            } else if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
                z++;
            }



    }
    public static void TextO(char arr[][]){




           if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O') {
               y++;
           } else if (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O') {
               y++;
           } else if (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O') {
               y++;
           } else if (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O') {
               y++;
           } else if (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O') {
               y++;
           } else if (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O') {
               y++;
           } else if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {
               y++;
           } else if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
               y++;
           }




    }
    public static boolean Test(char arr[][]){
        int caseX=0;
        int caseO=0;
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (arr[i][j]=='X'){
                    caseX++;
                }
                if (arr[i][j]=='O'){
                    caseO++;
                }
            }
        }
        boolean flag = true;
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (arr[i][j] == ' '|| arr[i][j] == '_'){
                    flag = false;
                }
            }
        }
        /*
        if (Math.abs(caseO-caseX)<=1) {
            if (z > y) {
                System.out.println("X wins");
            } else if (z < y) {
                System.out.println("O wins");

            }
            else if (z<1&&y<1&&!flag) {

                System.out.println("Game not finished");

            }
            else if(z<1&&y<1) {
                System.out.println("Draw");
            }

        } else if (z+y==2){
            System.out.println("Impossible");
        }
*/


        if (z > y) {
        System.out.println("X wins");
        testFlag=false;
        } else if(z < y)
        {
        System.out.println("O wins");
        testFlag =false;
        }
        else if(caseO+caseX==9)
        {
        System.out.println("Draw");
        testFlag=false;
        }
        return testFlag;
}


public static void test2(){
        while (testFlag){

            Move(board);
            displayBoard(board);
            TextO(board);
            TextX(board);
            Test(board);
            if(!testFlag){
                break;
            }
            Move2(board);
            displayBoard(board);
            TextO(board);
            TextX(board);
            Test(board);
        }
}



    public static void main(String[] args) {
        displayBoard(board);
        boardData();
        test2();





    }
}
