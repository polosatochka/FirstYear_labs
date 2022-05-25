package Timus;


import java.io.PrintWriter;
import java.util.Scanner;

public class Mega {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int turned = in.nextInt();
        int mins = in.nextInt();

        int[] arriving = new int[mins];
        int jam = 0;

        for(int i = 0; i < mins; i++){
            arriving[i] = in.nextInt();
        }

        for(int j : arriving){
            jam += j;
            jam -= turned;
            if(jam < 0) jam = 0;
        }
        out.println(jam);
        out.flush();
    }
}
