// this did work and I have broken it in the process of shooting for extra things ( taking user input and taking upper and lower case characters


package studios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Character.*;

public class CountingCrows {

    public static void main(String[] args) {
        // user will get us the string to process from the user
        Scanner user = new Scanner(System.in);
        String useInput;


        String forest;
        forest = "The first edition, published in Buenos Aires by Emecé, contained 181 pages. " +
                "In Madrid it was edited that year by Ultramar.\n" +
                "\n" +
                "Borges opts for an epilogue to this short story collection, different from the " +
                "cases of his previous collections The Garden of Forking Paths (1941) and " +
                "Artifices (1944) (later republished together in Ficciones), which had " +
                "a prologue. Regarding this, Borges begins The Book of Sand's epilogue by " +
                "saying: \"To prologue unread stories is an almost impossible work, as it demands " +
                "the analysis of plots one should not anticipate. I prefer, thus, an epilogue.\"[4] ";

        System.out.println("Please enter some text to process");
        useInput = user.next();
        countingCharacters(useInput);
    }

    static void countingCharacters(String inputStr) {

        HashMap<Character,Integer> map  = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<inputStr.length(); i++) {
            Character letterHold = inputStr.charAt(i);
                if (isLetter(letterHold)) {
                    if (isUpperCase(letterHold)) {
                        if (!map.containsKey(toUpperCase(letterHold))) {
                            map.put(toUpperCase(letterHold), 1);
                        } else {
                            map.put(toUpperCase(letterHold), map.get(toUpperCase(letterHold) + 1));
                        }
                    }
                    else {
                        if (!map.containsKey(toLowerCase(letterHold))) {
                            map.put(toLowerCase(letterHold), 1);
                        } else {
                            map.put(toLowerCase(letterHold), map.get(toLowerCase(letterHold) + 1));
                        }
                    }

                }
        }
        for (Character a: map.keySet()) {
            System.out.println(a+ "->" + map.get(a));
        }

    }

}
