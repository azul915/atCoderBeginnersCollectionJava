import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABC011_A {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N == 12 ? 1 : N + 1);

    }
}