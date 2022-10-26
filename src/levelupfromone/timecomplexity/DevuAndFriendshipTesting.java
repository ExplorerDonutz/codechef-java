package levelupfromone.timecomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DevuAndFriendshipTesting {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(System.in));

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
