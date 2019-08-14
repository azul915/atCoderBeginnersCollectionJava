import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC009_A {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int box = Integer.parseInt(br.readLine());
        System.out.println(box % 2 == 0 ? box/2 : box/2 + 1);

    }
}