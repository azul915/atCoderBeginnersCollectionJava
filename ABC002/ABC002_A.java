import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
 
class ABC002_A {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Optional<Integer> opi= Arrays.stream(input.split(" "))
                                        .map(Integer::parseInt)
                                        .max(Comparator.naturalOrder());
        System.out.println(opi.get());
    }
}