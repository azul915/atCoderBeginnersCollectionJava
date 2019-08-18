import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC010_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;

        for(int i = 0; i < a.length; i++) {
            while(a[i] % 3 == 2 || a[i] % 2 == 0) {
                a[i]--;
                count++;
            }
        }
        System.out.println(count);

    }
}