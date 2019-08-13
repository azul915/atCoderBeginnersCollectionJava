import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC086_A {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(
                Arrays.stream(input.split(" "))
                        .mapToInt(Integer::parseInt)
                        .reduce(1,(x, y) -> x * y % 2) != 0 ? "Odd":"Even"
        );

    }
}