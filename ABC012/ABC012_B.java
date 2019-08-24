import java.io.BufferedReader;
import java.io.InputStreamReader;

class ABC012_B {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int h, m, s = 0;

        if(N > 3599) {
            h = N / 3600;
            N = N - 3600 * h;
            if(N > 60) {
                m = N / 60;
                s = N - 60 * m;
            } else {
                m = 0;
                s = N;
            }
        } else {
            h = 0;
            if(N > 59) {
                m = N / 60;
                s = N % 60;
            } else {
                m = 0;
                s = N;
            }
        }
        String hh = h < 10 ? "0" + String.valueOf(h) : String.valueOf(h);
        String mm = m < 10 ? "0" + String.valueOf(m) : String.valueOf(m);
        String ss = s < 10 ? "0" + String.valueOf(s) : String.valueOf(s);

        System.out.printf("%s:%s:%s", hh, mm, ss);

    }
}