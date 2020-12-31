/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrone;

/**
 * CSC 206
 * Mr. Osborne
 * @author Isaiah J Jones
 * 1/27/17
 */
//Have the program prompt the user for a 3-digit number
//Scan the users number
//Print a statement telling whether or not the number is a palindrome
//Import Scanner
import java.util.Scanner;

public class PalinDrone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declare variables
        int testNumbuh;
        int firstNumbuh = 0;
        int lastNumbuh;

        //Prompt User for a 3 digit number
        System.out.println("Input a 3-digit number ");

        //Read and Store User's number
        Scanner input = new Scanner(System.in);
        testNumbuh = input.nextInt();

        //Make sure User's number is a 3-digit number
        //Get the first and last number
        if (testNumbuh < 100 || testNumbuh > 999) {
            System.out.println(testNumbuh + " is not a 3-digit number.");
        } else {
            firstNumbuh = testNumbuh / 100;
        }
        lastNumbuh = testNumbuh % 10;

        //Make sure the number is a palindrome
        //Show User results
        if (firstNumbuh == lastNumbuh) {
            System.out.println(testNumbuh + " is a palindrome");
        } else {
            System.out.println("Sorry " + testNumbuh + " is not a palindrome");
        }
    }
}
