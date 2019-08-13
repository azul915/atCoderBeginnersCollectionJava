import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class ABC081_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] intArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int count = 0; ; count++) {
            if(Arrays.stream(intArray).allMatch(i -> i % 2 == 0)) {
                intArray = Arrays.stream(intArray).map(i -> i / 2).toArray();
            } else {
                System.out.println(count);
                break;
            }
        }

    }
}