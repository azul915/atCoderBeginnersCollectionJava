import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
class ABC005_A {
    public static void main(String[] args) throws java.lang.Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] intArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(intArray[1]/intArray[0]);
    }
}