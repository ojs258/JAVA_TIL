import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String strings = "1 2 3 4 5";
        List<Integer> collect = Arrays.stream(strings.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (Object i : array) {
            System.out.println(i+1);
        }
    }
}