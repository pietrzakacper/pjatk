import java.util.Scanner;

public class Main {
    private static void ex1(int wrt) {
        String msg = "int z przedziału " +
        (wrt > 5 ? "<6, 10>" : "<0, 5>");

        System.out.println(msg);
    }

    private static void ex2(char chr) {
        String msg = "znak " +
        (chr > 'G' ? "A - G" : "H - Z");

        System.out.println(msg);
    }

    private static void ex3() {
        int input = 43707;
        int inputBitSize = Integer.BYTES * 8;
        int even = 0;

        for(int i=1; i<inputBitSize; i+=2) {
            even += input & (1 << i);
        }
        int odd = input - even;

        System.out.println("even: " + even);
        System.out.println("odd: " + odd);

        // TODO think about some bitwise magic based solution like
    }

    private static void ex4(byte input) {
        // ain't no way I'm using switch here
        // declarative programming for the win
        char[] hexCharacters = {
            '0' ,'1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        char hexResult = hexCharacters[input];

        System.out.println(hexResult);
    }

    private static void ex5() {
        for(int i = -50; i <= 50; i++) {
            if(i % 3 == 0 || i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void ex6() {
        // int s = 0;
        // for(int i = 1; i <= 10; i++) {
        //     s = s + i;
        // }

        int s = 0;
        int i = 1;

        while(i <= 10) {
            s = s + i;
            i++;
        }

        System.out.println(s);
    }

    // that's how I'd do it in work 'case it's cleaner
    private static void ex7() {
        char[][] square = {
            {'*', '*', '*', '*', '*', '*'},
            {'*', ' ', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', ' ', '*'},
            {'*', '*', '*', '*', '*', '*'},
        };

        for(int i = 0; i < square.length; i++) {
            for(int j =0; j < square[0].length; j++) {
                System.out.print(square[i][j]);
            }

            System.out.print('\n');
        }
    }

    // but I can do it your way too
    private static void ex72() {
        final int squareSize = 6;

        for(int i = 0; i < squareSize; i++) {
            for(int j =0; j < squareSize; j++) {
                char charToShow = (
                    i == 0 || i == squareSize -1 || j == 0 || j == squareSize -1
                ) ? '*' : ' ';
                
                System.out.print(charToShow);
            }

            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        // ex1(7);
        // ex2('B');
        // ex3();
        // ex4((byte)15);
        // ex5();
        // ex6();
        ex7();
        ex72();
    }
}