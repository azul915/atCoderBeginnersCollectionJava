import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
class ABC004_B {
    public static void main(String[] args) throws java.lang.Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] c = new String[4][4];

        for(int i = 0; i < 4; i++) {
            String[] array = br.readLine().split(" ");
            for(int j = 0; j < 4; j++) {
                c[i][j] = array[j];
            }
        }

        String[][] rotation = new String[4][4];

        for(int k = 0; k < 4; k++) {
            for(int l = 0; l < 4; l++) {
                rotation[k][l] = c[3 - k][3 - l];
                System.out.print(rotation[k][l] + " ");
            }
            System.out.println("");
        }

    }
}