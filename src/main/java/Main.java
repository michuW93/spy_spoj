import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> input = new ArrayList<>();

        /*Scanner in = new Scanner(System.in);
        String stringFromInput;
        while (in != null) {
            stringFromInput = in.next();
            input.add(stringFromInput);
        }*/

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = r.readLine()) != null) {
            input.add(s);
        }
        ArrayList<String> sorted = sort(input);
        sorted.forEach(System.out::println);

    }

    public static ArrayList<String> sort(ArrayList<String> input) {
        Collections.sort(input);
        return input;
    }
}
