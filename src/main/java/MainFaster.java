import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MainFaster {
    public static void main(String[] args) throws IOException {
        ArrayList<String> input = new ArrayList<>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = r.readLine()) != null) {
            input.add(s);
        }
        sort(input);
    }

    public static void sort(ArrayList<String> input) {
        Collections.sort(input);
        input.forEach(System.out::println);
    }
}