package levelupfromone.timecomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PlayingWithMatches {
    static final int[] MATCH_COUNT = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for(int i = 0; i < t; i++) {
                String[] str = in.readLine().split(" ");
                String num = String.valueOf(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
                int total = 0;
                for(int j = 0; j < num.length(); j++) {
                    int n = Integer.parseInt(num.substring(j, j + 1));
                    total += MATCH_COUNT[n];
                }
                System.out.println(total);
            }
        } catch (Exception e) {
            return;
        } finally {
            assert in != null;
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
