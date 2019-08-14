import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;


class ABC087_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());

        final long count = IntStream.rangeClosed(0, A).map(i -> 500 * i)
                                .flatMap(i -> IntStream.rangeClosed(0, B).map(j -> i + 100 * j))
                                .flatMap(i -> IntStream.rangeClosed(0, C).map(j -> i + 50 * j))
                                .filter(i -> i == X)
                                .count();
        System.out.println(count);

    }
}