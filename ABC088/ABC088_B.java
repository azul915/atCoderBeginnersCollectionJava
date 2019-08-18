import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ABC088_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.sort(list, Collections.reverseOrder());

        int alice = IntStream.range(0, list.size())
                            .filter(i -> i % 2 == 0)
                            .mapToObj(i -> list.get(i))
                            .mapToInt(Integer::intValue)
                            .sum();

        int bob = IntStream.range(0, list.size())
                            .filter(i -> i % 2 == 1)
                            .mapToObj(i -> list.get(i))
                            .mapToInt(Integer::intValue)
                            .sum();

        System.out.println(alice - bob);
    }
}