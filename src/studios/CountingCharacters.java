package studios;

public class CountingCharacters {

    public static void main(String[] args) {
        String string = "The best of both worlds akljaserouvzbxcnv,madjskf;";
        int count = 0;
        char temp;

        //Counts each character except space

        for(int i = 0; i < string.length(); i++) {

            temp = string.charAt(i);
            if( (temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z'))
            {
                count++;
            }
        }
        System.out.println("Total number of characters in a string: " + count);
    }

}
