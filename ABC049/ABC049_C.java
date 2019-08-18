import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class ABC049_C {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        long count = Stream.of(S).map(i -> i.replaceAll("eraser", "x"))
                    .map(i -> i.replaceAll("erase", "x"))
                    .map(i -> i.replaceAll("dreamer", "x"))
                    .map(i -> i.replaceAll("dream", "x"))
                    .map(i -> i.replaceAll("x", ""))
                    .filter(i -> i.equals(""))
                    .count();

        System.out.println(count > 0 ? "YES" : "NO");

    }
}