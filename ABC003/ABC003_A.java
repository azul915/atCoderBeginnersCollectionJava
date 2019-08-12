import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
 
class ABC003_A {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        IntStream.of(Integer.parseInt(input)).forEach(i -> System.out.println(i * (10000 + i * 10000)/(2 * i)));
    }
}