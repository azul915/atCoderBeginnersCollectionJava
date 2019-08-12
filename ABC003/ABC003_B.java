import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC003_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = Arrays.stream(br.readLine().split("")).toArray(String[]::new);
        String[] T = Arrays.stream(br.readLine().split("")).toArray(String[]::new);

        for(int i = 0; i < S.length; i++) {
            if(S[i].equals(T[i])) {
                continue;
            } else if(S[i].equals("@") && T[i].matches("[atcoder@]")) {
                continue;
            } else if(T[i].equals("@") && S[i].matches("[atcoder@]")) {
                continue;
            } else {
                System.out.println("You will lose");
                return;
            }
        }
        System.out.println("You can win");

    }
}