
public class ArraysAndVectors {
    public static void main(String[] args) {

        System.out.println("\n Welcome to the Array Program!\n");

        // Create an int array
        int[ ] myNumbers = new int[8];

        // Fill in the array with ints
        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;

        // output the array
        System.out.println( "myNumbers[3] = " + myNumbers[3]);

        System.out.println("\n\n");

        for (int i = 0; i < 8; i++ ) {
            // print the elements of the array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        // fill the array with 5, 10, 15, etc.
        int myFiveContainer = 0;
        for (int i = 0; i < 8; i++) {
            // print the elements of the array
            myNumbers[i] =myFiveContainer += 5;
        }

        System.out.println("\n\n this array should be the fives: ");
        for (int i = 0; i < 8; i++ ) {
            // print the elements of the array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        }

    }

    // create a 2D array
    