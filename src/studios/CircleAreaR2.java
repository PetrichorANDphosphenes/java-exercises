//package studios;
//
//import java.io.IOException;
//import java.util.Scanner;
//import java.math.*;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//
//public class CircleAreaR2 {
//
//
//    // I am adding the necessary elements to provide validation
//    // this revised circle area program is to learn how to store data and keep track of multiple circles and calculations
//    public static void main(String[] args) {
//
//        double area = 0.0;
//        // holding variable for your output area
//        double usrRadius = 0.0;
//        // double to hold the variable for the radius
//        int track = 1;
//        String circleName = "";
//        // this name is a string for holding the circle names
//        Scanner cArea = new Scanner(System.in);
//
//
//
//        //main can take in arguments of any amounts
//        System.out.println("Welcome to the circle area calculator");
//        System.out.println("to keep track of your circles, you'll be asked to name your circles");
//        System.out.println("Enter your circle name:");
//        circleName = cArea.nextLine();
//        System.out.println("Enter the radius for your circle:" + circleName);
//        usrRadius = cArea.nextDouble();
//        if (usrRadius > 0) {
//
//            area = 3.14 * Math.pow(usrRadius, 2);
//
//            System.out.println("Storing" + circleName + "with an area of:" + area);
//            try {
//                FileWriter cA = null;
//                try {
//                    cA = new FileWriter("/home/cute/lc101/java-exercises/resources/areaHolder.txt\n");
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                cA.write(circleName);
//                cA.write(area);  // cannot write a double
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//        else {
//            while (track == 1) {
//                System.out.println("Your radius must be a number greater than 0");
//                System.out.println("Enter the radius for your circle:" + circleName);
//                usrRadius = cArea.nextDouble();
//                if (usrRadius > 0) {
//                    track = 0;
//                    area = 3.14 * Math.pow(usrRadius, 2);
//
//
//                    System.out.println("Storing" + circleName + "with an area of:" + area);
//                }
//
//            }
//
//        }
//
//
//    }
//}
