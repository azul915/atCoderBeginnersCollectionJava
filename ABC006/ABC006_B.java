import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABC006_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n = 8;

        int[] array = new int[n];
        array[0] = 0;
        array[1] = 0;
        array[2] = 1;

        for(int i = 3; i < n; i++) {
            array[i] = array[i - 3] + array[i - 2] + array[i - 1];
        }

        System.out.println(array[n - 1] % 10007);

    }
}