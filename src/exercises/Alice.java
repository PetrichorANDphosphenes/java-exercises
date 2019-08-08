package exercises;
import java.util.Scanner;

/**
 * Prompt user for their name and then greet them with their name
 *
 */
class MyAlice  {
public static void main(String[] args)  {
    Scanner myObj = new Scanner(System.in);//Create a Scanner object

    System.out.println("Please enter a name, an age and a salary"); //Output user input

    String name = myObj.nextLine();
    //string input for name

    int age = myObj.nextInt();
    // on the next line age is taken from the input
    double salary = myObj.nextDouble();
    // Numerical input
    // After the last entry input upon hitting the enter key the name, age and salary will all be inputted

    System.out.println("Name: " + name);
    System.out.println("Age: " +age);
    System.out.println("Salary: " + salary);
  }
}