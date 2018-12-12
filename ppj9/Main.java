import java.util.ArrayList;

public class Main {
    static void printArr(int[][] arr) {
        for(int i=0; i<arr.length;++i) {
            for(int j=0; j<arr[0].length;++j) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    static void printArr(char[][] arr) {
        for(int i=0; i<arr.length;++i) {
            for(int j=0; j<arr[0].length;++j) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static void ex1() {
        int[][] arr = new int[8][8];
        for(int i=0; i<arr.length;++i) {
            for(int j=0; j<arr[0].length;++j) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int numberToSearchFor=0; numberToSearchFor< 10; ++numberToSearchFor) {
            int numberOfOccurences = 0;
            for(int i=0; i < arr.length; i++) {
                if(arr[i][i] == numberToSearchFor
                || arr[i][arr.length - 1 - i] == numberToSearchFor) {
                    numberOfOccurences++;
                }
            }

            if(numberOfOccurences >= 3) {
                System.out.println(
                    "Number " + numberToSearchFor +
                    " occured " + numberOfOccurences +
                    "times"
                );
            }
        }
    }

    static void ex2() {
        char[][] arr = new char[10][10];

        for(int i=0; i<arr.length;++i) {
            for(int j=0; j<arr[0].length;++j) {
                arr[i][j] = (char)(Math.random() * ('z' - 'a'));
                arr[i][j] += 'a'; 
            }
        }

        printArr(arr);


        for(int i = 0; i < arr.length; ++i) {
            if(arr.length - i < 3) {
                break;
            }
            if(arr[0][i+1] > arr[0][i] && arr[0][i+2] > arr[0][i+1]) {
                System.out.println(
                    "Top edge: 3 indexes starting from " + i + " are continously greater"
                );
            }

            if(arr[arr.length - 1][i+1] > arr[arr.length - 1][i]
            && arr[arr.length - 1][i+2] > arr[arr.length - 1][i+1]) {
                System.out.println(
                    "Bottom edge: 3 indexes starting from " + i + " are continously greater"
                );
            }

            if(arr[i+1][0] > arr[i][0] && arr[i+2][0] > arr[i+1][0]) {
                System.out.println(
                    "Left edge: 3 indexes starting from " + i + " are continously greater"
                );
            }

            if(arr[i+1][arr.length - 1] > arr[i][arr.length - 1]
            && arr[i+2][arr.length - 1] > arr[i+1][arr.length - 1]) {
                System.out.println(
                    "Right edge: 3 indexes starting from " + i + " are continously greater"
                );
            }
        }
    }

    static boolean isEqual(int arr1[][], int arr2[][]) {
        if(arr1.length == 0 && arr2.length == 0) {
            return true;
        }

        System.out.println(arr1[0].length + " " + arr2[0].length);
        
        if(arr1.length != arr2.length
        || arr1[0].length != arr2[0].length) {
            return false;
        }

        for(int i=0; i<arr1.length;++i) {
            // if(arr1[i].length != arr2.)

            for(int j=0; j<arr1[0].length;++j) {
                if(arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    static int[] rollDice() {
        int[] rolls = new int[2];

        for(int i=0; i<rolls.length; ++i) {
            rolls[i] = (int)(Math.random() * 6) + 1;
        }

        return rolls;
    }

    static void ex4() {
        char[][] arr = new char[6][6];
        
        for(int i=0; i<arr.length;++i) {
            for(int j=0; j<arr[0].length;++j) {
                arr[i][j] = 0;
            }
        }

        boolean shouldXMove = false;
        int numberOfElementsFilled = 0;

        while(numberOfElementsFilled != 36) {
            int[] coords = rollDice();
            if(arr[coords[0] - 1][coords[1] - 1] == 0) {
                arr[coords[0] - 1][coords[1] - 1] = shouldXMove ? 'x' : 'o';
                shouldXMove = !shouldXMove;
                numberOfElementsFilled++;
            }
        }

        printArr(arr);
    }

    static boolean hasSbWon(char[][] arr) {
        return 
            arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && (arr[1][0] == 'x' || arr[1][0] == 'o')
        ||  arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1] && (arr[2][1] == 'x' || arr[2][1] == 'o')
        ||  arr[0][2] == arr[1][2] && arr[1][2] == arr[1][2] && (arr[1][2] == 'x' || arr[1][2] == 'o')
        ||  arr[0][0] == arr[0][1] && arr[0][1] == arr[0][1] && (arr[0][1] == 'x' || arr[0][1] == 'o')
        ||  arr[1][0] == arr[1][1] && arr[1][1] == arr[1][1] && (arr[1][1] == 'x' || arr[1][1] == 'o')
        ||  arr[2][0] == arr[2][1] && arr[2][1] == arr[2][1] && (arr[2][1] == 'x' || arr[2][1] == 'o')
        ||  arr[0][0] == arr[1][1] && arr[1][1] == arr[1][1] && (arr[1][1] == 'x' || arr[1][1] == 'o')
        ||  arr[0][2] == arr[1][1] && arr[1][1] == arr[1][1] && (arr[1][1] == 'x' || arr[1][1] == 'o')
        ; 
    }

    static boolean isBoardFull(char[][] arr) {
        for(int i=0; i<arr.length;++i) {
            for(int j=0; j<arr[0].length;++j) {
                if(arr[i][j] != 'x' && arr[i][j] != 'o') {
                    return false;
                }
            }
        }

        return true;
    }

    static char[][] copyBoard(char[][] arr) {
        char[][] copy = new char[3][3];

        for(int i=0; i<arr.length;++i) {
            for(int j=0; j<arr[0].length;++j) {
                copy[i][j] = arr[i][j];
            }
        }

        return copy;
    }

    static boolean doesMoveLeadToWin(char[][] board, char player) {
        if(hasSbWon(board)) {
            return true;
        }

        if(isBoardFull(board)) {
            return hasSbWon(board);
        }

        ArrayList<int[]> emptyIndicies = new ArrayList<int[]>();
        
        for(int i=0; i<board.length;++i) {
            for(int j=0; j<board[0].length;++j) {
                if(board[i][j] == 0) {
                    int[] coord = {i ,j};
                    emptyIndicies.add(coord);
                }
            }
        }

        for(int i=0; i < emptyIndicies.size(); ++i) {
            char[][] afterMove = copyBoard(board);
            afterMove[emptyIndicies.get(i)[0]][emptyIndicies.get(i)[1]] = player;
            if(doesMoveLeadToWin(afterMove, player == 'x' ? 'o' : 'x')) {
                return true;
            }
        }

        return false;
    }

    static void ex5() {
        char[][] board = {
            {0, 0, 'o'},
            {0, 0, 0},
            {0, 0, 0}
        };

        System.out.println(!doesMoveLeadToWin(board, 'x'));
    }

    public static void main(String[] args) {
        //ex1();
        //ex2();

        // int[][] arr1 = {
        //     {1, 2},
        //     {3, 3}
        // };

        // int[][] arr2 = {
        //     {1, 2},
        //     {3, 3}
        // };

        // System.out.println(isEqual(arr1, arr2));

        // ex4();

        ex5();
    }
}