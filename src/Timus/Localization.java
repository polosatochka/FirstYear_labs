package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Localization {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int monster = in.nextInt();

        if(monster>=1 && monster <=2000) {
            if (monster >= 1 && monster <= 4)
                out.println("few");
            else if (monster >= 5 && monster <= 9)
                out.println("several");
            else if (monster >= 10 && monster <= 19)
                out.println("pack");
            else if (monster >= 20 && monster <= 49)
                out.println("lots");
            else if (monster >= 50 && monster <= 99)
                out.println("horde");
            else if (monster >= 100 && monster <= 249)
                out.println("throng");
            else if (monster >= 250 && monster <= 499)
                out.println("swarm");
            else if (monster >= 500 && monster <= 999)
                out.println("zounds");
            else if (monster >= 1000)
                out.println("legion");
        }
        out.flush();
    }
}
