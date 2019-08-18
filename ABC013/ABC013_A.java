import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC013_A {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = br.readLine();

        String[] alphabet = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < alphabet.length; i++) {
            if(X.equals(alphabet[i])) {
                System.out.println(i + 1);
                return;
            }
        }

    }
}