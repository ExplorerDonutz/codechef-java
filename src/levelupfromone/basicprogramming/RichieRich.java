package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RichieRich {
    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] str = in.readLine().split(" ");
                System.out.println((-Integer.parseInt(str[0]) + Integer.parseInt(str[1])) / Integer.parseInt(str[2]));
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
