import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MainTest {
    @Test
    public void sortTwoWordsReversedTest() {
        List<String> expected = Arrays.asList("A", "B");
        ArrayList<String> input = new ArrayList<>(2);
        input.add("B");
        input.add("A");

        ArrayList<String> result = Main.sort(input);

        Assertions.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void sortTwoWordsNaturalOrderTest() {
        List<String> expected = Arrays.asList("A", "B");
        ArrayList<String> input = new ArrayList<>(2);
        input.add("B");
        input.add("A");

        ArrayList<String> result = Main.sort(input);

        Assertions.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void sortTwoWordsSpojInputTest() {
        List<String> expected = Arrays.asList("HERR", "MULLER", "RADZIECKI", "WYWIAD", "WZYWA");
        ArrayList<String> input = new ArrayList<>(2);
        input.add("RADZIECKI");
        input.add("MULLER");
        input.add("WYWIAD");
        input.add("WZYWA");
        input.add("HERR");

        ArrayList<String> result = Main.sort(input);

        Assertions.assertArrayEquals(expected.toArray(), result.toArray());
    }
}
