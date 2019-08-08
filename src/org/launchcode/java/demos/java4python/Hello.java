package org.launchcode.java.demos.java4python;
import java.util.Scanner; //

/**
 * From "Java for Python Programmers"
 */
public class Hello {

    public static void main(String[] args) {

        Scanner inpScan = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What's your name?");
        String name = inpScan.nextLine(); // scanner to collect user input
        System.out.println("Hello " + name );
    }

}
