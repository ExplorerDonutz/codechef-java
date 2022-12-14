package levelupfromone.timecomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class DevuAndFriendshipTesting {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());

            for (int i = 0; i < t; i++) {
                int n = Integer.parseInt(in.readLine());
                String[] d = in.readLine().split(" ");

                Set<String> set = new HashSet<>();
                for (int j = 0; j < n; j++) {
                    set.add(d[j]);
                }

                System.out.println(set.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
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
