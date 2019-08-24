import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

class ABC011_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = Arrays.stream(br.readLine().split("")).toArray(String[]::new);

        for (int i = 0; i < input.length; i++) {

            if(i == 0) {
                if(Character.isUpperCase(input[i].charAt(0))) {
                    continue;
                } else {
                    input[i] = input[i].toUpperCase();
                }
            } else {
                if(Character.isLowerCase(input[i].charAt(0))) {
                    continue;
                } else {
                    input[i] = input[i].toLowerCase();
                }
            }

        }
        Arrays.stream(input).forEach(System.out::print);
    }
}