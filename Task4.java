package task.pkg4;

import java.util.Arrays; 
import java.util.Scanner; 

class Task4 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        
        int[] myArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        
        System.out.println("\nEnter 15 numbers to our array: \n(After each number, press enter to input.)");
        myArray[0] = input.nextInt(); // store 1st position
        myArray[1] = input.nextInt();
        myArray[2] = input.nextInt();
        myArray[3] = input.nextInt();
        myArray[4] = input.nextInt();
        myArray[5] = input.nextInt();
        myArray[6] = input.nextInt();
        myArray[7] = input.nextInt();
        myArray[8] = input.nextInt();
        myArray[9] = input.nextInt();
        myArray[10] = input.nextInt();
        myArray[11] = input.nextInt();
        myArray[12] = input.nextInt();
        myArray[13] = input.nextInt();
        myArray[14] = input.nextInt(); // store 15th position

        // converting the array to a string list.
        var myList = Arrays.toString(myArray);


        // display the array to the user as a list.
        System.out.println("Our array has the following values: " + myList);
        

        System.out.println("Enter any number to check if it is in the array: ");
        var numInput = input.nextInt();

        check(myArray, numInput);

    }

    private static void check(int[] arr, int valueToCheck) {

        boolean test = false;
        for (int num : arr) {

            if (num == valueToCheck) {
                test = true;
                break;
            }

        }

        // display the result
        if (test) {
            System.out.println(valueToCheck + " is in the array.");
        } else {
            System.out.println(valueToCheck + " is not in the array.");
        }

    }
}
