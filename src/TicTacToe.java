import java.util.Scanner;
public class TicTacToe {
    static char[][] board = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        public static void printBoard() {
            for (char[] row : board) {
                for (char c : row) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }

        public static void placeMove(int pos, char symbol) {
            switch (pos) {
                case 1 -> board[0][0] = symbol;
                case 2 -> board[0][2] = symbol;
                case 3 -> board[0][4] = symbol;
                case 4 -> board[2][0] = symbol;
                case 5 -> board[2][2] = symbol;
                case 6 -> board[2][4] = symbol;
                case 7 -> board[4][0] = symbol;
                case 8 -> board[4][2] = symbol;
                case 9 -> board[4][4] = symbol;
            }
        }

        public static boolean isWinner(char symbol) {
            // Check rows, columns, diagonals
            return (board[0][0] == symbol && board[0][2] == symbol && board[0][4] == symbol) || // top row
                    (board[2][0] == symbol && board[2][2] == symbol && board[2][4] == symbol) || // mid row
                    (board[4][0] == symbol && board[4][2] == symbol && board[4][4] == symbol) || // bottom row
                    (board[0][0] == symbol && board[2][0] == symbol && board[4][0] == symbol) || // left col
                    (board[0][2] == symbol && board[2][2] == symbol && board[4][2] == symbol) || // mid col
                    (board[0][4] == symbol && board[2][4] == symbol && board[4][4] == symbol) || // right col
                    (board[0][0] == symbol && board[2][2] == symbol && board[4][4] == symbol) || // diagonal
                    (board[0][4] == symbol && board[2][2] == symbol && board[4][0] == symbol);   // other diagonal
        }

        public static boolean isFull() {
            for (int i = 1; i <= 9; i++) {
                int row = switch (i) {
                    case 1, 2, 3 -> 0;
                    case 4, 5, 6 -> 2;
                    case 7, 8, 9 -> 4;
                    default -> -1;
                };
                int col = switch (i) {
                    case 1, 4, 7 -> 0;
                    case 2, 5, 8 -> 2;
                    case 3, 6, 9 -> 4;
                    default -> -1;
                };
                if (board[row][col] == ' ') return false;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char currentPlayer = 'X';

            while (true) {
                printBoard();
                System.out.print("Player " + currentPlayer + ", enter position (1-9): ");
                int pos = sc.nextInt();

                if (pos < 1 || pos > 9) {
                    System.out.println("Invalid position! Try again.");
                    continue;
                }

                // Check if position is empty
                int row = (pos - 1) / 3 * 2; 
                int col = ((pos - 1) % 3) * 2;
                if (board[row][col] != ' ') {
                    System.out.println("Position already taken! Try again.");
                    continue;
                }

                placeMove(pos, currentPlayer);

                if (isWinner(currentPlayer)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }

                if (isFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }

            sc.close();
        }
    }

