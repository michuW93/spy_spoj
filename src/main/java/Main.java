import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> input = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String stringFromInput;
        while (in != null) {
            stringFromInput = in.next();
            input.add(stringFromInput);
        }

        ArrayList<String> sorted = sort(input);
        sorted.forEach(System.out::println);

    }

    public static ArrayList<String> sort(ArrayList<String> input) {
        Collections.sort(input);
        return input;
    }
}
