import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class ABC008_B {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new LinkedHashMap<>();
        String candidate;

        for(int i = 0; i < N; i++) {
            candidate = br.readLine();
            if(!map.containsKey(candidate)) {
                map.put(candidate, 1);
            } else {
                map.put(candidate, map.get(candidate).intValue() + 1);
            }
        }

        Entry<String, Integer> maxEntry = null;
        for(Entry<String, Integer> entry : map.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        System.out.println(maxEntry.getKey());
    }
}