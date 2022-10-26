package levelupfromone.timecomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LuckyFour {
    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for (int i = 0; i < t; i++) {
                String[] str = in.readLine().split("");
                int count = 0;
                for (int j = 0; j < str.length; j++) {
                    if (str[j].equals("4"))
                        count++;
                }
                System.out.println(count);
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
