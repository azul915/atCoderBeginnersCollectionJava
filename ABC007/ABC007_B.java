import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC007_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] A = Arrays.stream(br.readLine().split("")).toArray(String[]::new);
        System.out.println(A.length == 1 && A[0].equals("a") ? -1 : "a");

    }
}