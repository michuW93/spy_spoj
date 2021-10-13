import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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

    public static void sort(ArrayList<String> input) throws IOException {
        Collections.sort(input);

        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));

        for (String element : input){
            output.write(element + "\n");
        }
        output.flush();
    }
}