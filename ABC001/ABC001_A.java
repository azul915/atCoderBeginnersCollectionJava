import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class ABC001_A {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int H1 = Integer.parseInt(br.readLine());
        int H2 = Integer.parseInt(br.readLine());
        System.out.println(H1 - H2);

    }
}