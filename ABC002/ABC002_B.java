import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class ABC002_B {
    public static void main(String[] args) throws java.lang.Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String removed = input.replaceAll("[aeiou]", "");
        System.out.println(removed);
    }
}