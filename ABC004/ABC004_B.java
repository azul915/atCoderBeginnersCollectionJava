import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
class ABC004_B {
    public static void main(String[] args) throws java.lang.Exception {
 
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hoge = "o o x x";
        String[][] c = new String[4][4];

        for(int i = 0; i < 4; i++) {
            String[] array = hoge.split(" ");
            for(int j = 0; j < 4; j++) {
                c[i][j] = array[j];
            }
        }

        for(int k = 0; k < 4; k++) {
            for(int l = 0; l < 4; l++) {
                c[k][l] = c[3 - k][3 - l];
                System.out.print(c[k][l] + " ");
            }
            System.out.println("");
        }
        
    }
}