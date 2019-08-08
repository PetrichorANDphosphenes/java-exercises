package exercises;

import java.util.ArrayList;

public class EvenSum {

    public static void main(String[] Args) {
        //create and array list of numbers and then call the method sumOfEven
        ArrayList<Integer> alistTwelve = new ArrayList<>();


        alistTwelve.add(1);
        alistTwelve.add(14);
        alistTwelve.add(17);
        alistTwelve.add(21);
        alistTwelve.add(132);
        alistTwelve.add(114);
        alistTwelve.add(311);
        alistTwelve.add(1421);
        alistTwelve.add(18);
        alistTwelve.add(14);
        alistTwelve.add(166);
        alistTwelve.add(10);

        //we've added 12 seperate
        System.out.println(sumOfEven(alistTwelve));


    }

    public static int sumOfEven(ArrayList<Integer> aList) {
        //take the Arraylist given and add all the numbers

        int sum = 0; // the value to return

        for (Integer number : aList) {
            if (number%2 ==0) {
                sum += number;
            }
        }

        return sum;
    }

}
