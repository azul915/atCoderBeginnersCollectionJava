import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABC015_A {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        System.out.println(A.length() > B.length() ? A : B);

    }
}