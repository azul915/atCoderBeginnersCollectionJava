import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABC014_A {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a > b ? b - (a % b) : b - a);

    }
}