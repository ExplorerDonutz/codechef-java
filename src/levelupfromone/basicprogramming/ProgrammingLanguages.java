package levelupfromone.basicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ProgrammingLanguages {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] line = in.readLine().split(" ");
                int a = Integer.parseInt(line[0]);
                int b = Integer.parseInt(line[1]);
                int c = Integer.parseInt(line[2]);
                int d = Integer.parseInt(line[3]);
                int e = Integer.parseInt(line[4]);
                int f = Integer.parseInt(line[5]);

                if ((a == c && b == d) || (a == d && b == c))
                    System.out.println(1);
                else if ((a == e && b == f) || (a == f && b == e))
                    System.out.println(2);
                else
                    System.out.println(0);
            }
        } catch (Exception e) {
            return;
        }
    }
}
