import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABC001_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        String vv = "";

        if(m < 100) {
            vv = "00";
        } else if(m <= 5000) {
            vv = m < 1000 ? "0" + String.valueOf(m / 100) : String.valueOf(m / 100);
        } else if(m <= 30000) {
            vv = String.valueOf(m / 1000 + 50);
        } else if(m <= 70000) {
            vv = String.valueOf(((m / 1000) - 30) / 5 + 80);
        } else if(70000 < m) {
            vv = "89";
        }
        System.out.println(vv);
    }
}