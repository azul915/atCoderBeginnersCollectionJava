import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

class ABC085_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long count = br.lines().limit(N).collect(Collectors.toList()).stream().distinct().count();
        System.out.println(count);

    }

}