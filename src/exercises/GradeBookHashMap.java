/* instead od taking names and grades as with GradeBook
// this program takes Student IDs and Names
// holding the IDs as Keys and the names as values
// integrate functionality to allow for searching
// by name or ID
*/

package exercises;
// import to use hashmap
import java.util.HashMap;
import java.util.Scanner;


public class GradeBookHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        Scanner entry = new Scanner(System.in);
        String newEntry;

        System.out.println("Welcome to gradebook");
        //ask for input to search, list or create a new entry.
        //if search then allow for name or number as a search method
/*
//        //columns in the gradebook
//        HashMap<String, String> bookColumns = new HashMap<>();
//        bookColumns.put("id", "ID");
//        bookColumns.put("name", "Name");
//        bookColumns.put("gpa", "G.P.A.");
//        bookColumns.put("learning style", "Learning Style");
*/

        //initial menu options
        HashMap<String, String> menuChoices = new HashMap<>();
        menuChoices.put("search", "Search");
        menuChoices.put("list", "List");
        menuChoices.put("new entry", "New Entry");



    }


}
