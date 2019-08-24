import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABC013_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int p1 = 0; int p2 = 0;

        if(a < b) {
            p1 = b - a;
        } else if(a > b) {
            p1 = a - b;
        } else {
            System.out.println(0);
        }

        p2 = 10 - p1;
        System.out.println(p1 > p2 ? p2 : p1);

    }
}