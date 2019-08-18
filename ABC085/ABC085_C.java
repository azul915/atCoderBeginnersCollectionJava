import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC085_C {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i <= array[0]; i++) {
            for (int j = 0; j <= array[0] - i; j++) {
                int k = array[0] - i - j;
                if(10000 * i + 5000 * j + 1000 * k == array[1]) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");

    }

}