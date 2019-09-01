import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC139_A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split("");
        String[] T = br.readLine().split("");

        int count = 0;
        for (int i = 0; i < S.length; i++) {
            if(S[i].equals(T[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}