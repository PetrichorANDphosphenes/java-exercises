package org.launchcode.java.demos.inclass;
import java.util.ArrayList;

public class ArrayListPractice {

        public static void main(String[] args) {
            ArrayList<Integer> first = new ArrayList<Integer>();

            first.add(3);
            first.add(4);
            first.add(5);
            first.add(1);

            ArrayList<Integer> second = new ArrayList<Integer>();
            second.add(1);
            second.add(6);


            ArrayList<Integer> answer = addLists(first, second);

            System.out.println(answer);
        }

    //two array lists of integers and combined into one
    //Array lists can only take in Object 5 DataTypes


    public static ArrayList<Integer> addLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        //Create array list
        ArrayList<Integer> results = new ArrayList<Integer>();

        //get the length of both lists
        int length1 = list1.size();
        int length2 = list2.size();


        ArrayList<Integer> smaller = list1;
        ArrayList<Integer> larger = list2;

        // see which list is longer
        if (length1 > length2) {

            smaller  = list1;
            larger = list2;
        }

        // for the remaining values in the longer list, copy values
        // for each value in the smaller list

        for (int i = smaller.size(); i <larger.size(); i++) {
            //add values from both lists
            results.add(larger.get(i));
        }
        // return values
    return results;
    }
}
