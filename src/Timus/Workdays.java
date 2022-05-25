package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Workdays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        int result = (m+1)*n;

        out.println(result);
        out.flush();
    }
}
