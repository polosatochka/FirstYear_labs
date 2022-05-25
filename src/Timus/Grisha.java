package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Grisha {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int problem = in.nextInt();

        if(problem <= 12 & problem >= 7)
            out.println("YES");
        else out.println("NO");

        out.flush();
    }
}