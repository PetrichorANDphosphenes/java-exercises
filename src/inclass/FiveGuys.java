package inclass;

import java.util.ArrayList;
public class FiveGuys {

    public static void main(String[] args) {
    ArrayList<String> wordList = new ArrayList<>();

    wordList.add("alpha");
    wordList.add("beta");
    wordList.add("theta");
    wordList.add("Delta");
    wordList.add("Omega");
    wordList.add("lengthy");

    printFive(wordList);

    }

    public static void printFive(ArrayList<String> aList) {

        //loop through each word
        for (String word : aList) {
            if (word.length() ==5) {
                System.out.print(word+"\n");
            }

        }

        //check size of each word, if exactly five then print

    }

}
