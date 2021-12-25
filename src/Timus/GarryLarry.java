package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class GarryLarry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);



        int a=in.nextInt();
        int b=in.nextInt();

        int c=(a+b)-1;

        if(c<=10) {
            int g = c - a;
            int l = c - b;
            out.println(g);
            out.println(l);
        }
        out.flush();
    }
}
