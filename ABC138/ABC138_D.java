import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ABC138_D {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        while(input == null) {
            input = input + br.readLine();
        }

        Set<String> set = new HashSet<>();
        String[] inputArray = input.split(" ");

        for (int i = 0; i < inputArray.length; i++) {
            if(Character.isUpperCase(inputArray[i].charAt(0)) || Character.isDigit(inputArray[i].charAt(0))) {
                set.add(inputArray[i]);
            }
        }

        System.out.println(set.size());
    }
}