import java.util.Scanner;

public class tictac {
    private char[][] board;
    private char currentPlayer;

    public tictac() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    // Initialize the board with empty cells
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current board
    private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check if the board is full
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Check if someone has won the game
    private boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin() {
        return (checkRowCol(board[0][0], board[1][1], board[2][2]) || checkRowCol(board[0][2], board[1][1], board[2][0]));
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }

    // Switch player turns
    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Play the game
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        System.out.println("Welcome to Tic Tac Toe!");

        while (!gameOver) {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn. Enter row (0-2) and column (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;

                if (checkForWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins! Congratulations!");
                    gameOver = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move! Please try again.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        tictac game = new tictac();
        game.playGame();
    }
}
