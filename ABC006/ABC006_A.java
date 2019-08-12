import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class ABC006_A {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(br.readLine()) % 3 == 0 ? "YES" : "NO");
    }
}