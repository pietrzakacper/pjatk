public class Main {
    static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
    static void printArr(double[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    } 
    static void printArr(byte[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    } 

    static int[] getRandomArr() {
        int[] arr = new int[(int)(Math.random() * 5) + 1];
        
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = (int)(Math.random() * 10);
        }
        
        return arr;
    }

    static void ex1() {
        int[] arr1 = getRandomArr();
        int[] arr2 = getRandomArr();
        int[] shorterArr, longerArr;

        if(arr1.length > arr2.length) {
            shorterArr = arr2;
            longerArr = arr1;
        } else {
            shorterArr = arr1;
            longerArr = arr2;
        }

        System.out.println("shorter arr:");
        printArr(shorterArr);
        System.out.println("longer arr:");
        printArr(longerArr);

        int[] mergedArr = new int[arr1.length + arr2.length];
        
        for(int i = 0; i < shorterArr.length; ++i) {
            mergedArr[2*i] = shorterArr[i];
            mergedArr[2*i+1] = longerArr[i];
        } 
        for(int i = shorterArr.length; i < longerArr.length; ++i) {
            mergedArr[shorterArr.length + i] = longerArr[i];
        }

        System.out.println("merged arr:");
        printArr(mergedArr);
    }

    static void ex2() {
        int[] tab = {1, 2, 3, 4, 4, 3, 2, 1};

        for(int i = 0; i < tab.length / 2; ++i) {
            if(tab[i] != tab[tab.length - 1 - i]) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }

    static void ex3() {
        double[] arr = new double[10];
        
        for(int i = 0; i < arr.length; ++i) {
            // possibly does not include 10.0
            arr[i] = (Math.random() * 20 - 10);
        }

        printArr(arr);

        mainloop:
        for(int i = 0; i < arr.length; ++i) {
            int inspectedIndex = i;

            for(int j = 0; j < inspectedIndex; ++j) {
                if(arr[j] >= arr[inspectedIndex]) {
                    continue mainloop;
                }
            }

            for(int j = inspectedIndex + 1; j < arr.length; ++j) {
                if(arr[j] <= arr[inspectedIndex]) {
                    continue mainloop;
                }
            }

            System.out.println(
                "index: " + inspectedIndex +
                " | value: " + arr[inspectedIndex]
            );
        }
    }

    static void ex4() {
        char[] inputArr = {'a', 'b', 'a', 'c'};
        char[] charsFound = new char[inputArr.length];
        int charsFoundNumber = 0;

        mainloop:
        for(int i = 0; i < inputArr.length; ++i) {
            for(int j = 0; j < charsFoundNumber; ++j) {
                if(inputArr[i] == charsFound[j]) {
                    continue mainloop;
                }
            }

            charsFound[charsFoundNumber] = inputArr[i];
            charsFoundNumber++;
        }

        for(int i = 0; i < charsFoundNumber; ++i) {
            System.out.println(charsFound[i]);
        }
    }

    static void ex5() {
        byte[] inputArr = {3, 1, 4, 5, 2, 1};
        int evenNumberCount = 0;

        for(int i = 0; i < inputArr.length; ++ i) {
            if(inputArr[i] % 2 == 0) {
                evenNumberCount++;
            }
        }

        int oddNumberCount = inputArr.length - evenNumberCount;

        System.out.println("Array: ");
        printArr(inputArr);
    
        System.out.println("Even count: " + evenNumberCount);
        System.out.println("Odd count: " + oddNumberCount);

        byte[] evenNumbers = new byte[evenNumberCount];
        byte[] oddNumbers = new byte[oddNumberCount];
    }

    public static void main(String[] argv) {
        ex1();
        // ex2();
        // ex3();
        // ex4();
        // ex5();
    }
}