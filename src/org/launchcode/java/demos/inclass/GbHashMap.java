package org.launchcode.java.demos.inclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GbHashMap {
//augmented to save ids and names instead of names and grade

        public static void main(String[] args) {

            HashMap<Integer, String> students = new HashMap<>();
            Scanner in = new Scanner(System.in);
            String newStudent;
            Integer newID;

            System.out.println("Enter your students (or ENTER to finish):");

            // Get student names and grades
            do {

                System.out.print("Student ID: ");
                newID = in.nextInt();

                if (!newID.equals("")) {
                    System.out.print("Name: ");
                    newStudent = in.nextLine();
                    students.put(newID, newStudent);

                    // Read in the newline before looping back
                    in.nextLine();
                }

            }
            while(!newID.equals(0));
                for (Map.Entry<Integer, String> student : students.entrySet()) {


                    System.out.println(student.getKey() + student.getValue());

                }
                        //variableName.equals("thing to compare") will compare
            // the values rather than == which looks to see if the reference point is the same
            //;
            /*
            // Print class roster
            System.out.println("\nClass roster:");
            double sum = 0.0;


            for (Map.Entry<Integer, String> student : students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");
                sum += student.getValue();
            }

            double avg = sum / students.size();
            System.out.println("Average grade: " + avg);

             */
        }

    }


