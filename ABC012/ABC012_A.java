import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC012_A {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(array[1] + " " + array[0]);

    }
}