package Timus;
import java.io.PrintWriter;
import java.util.Scanner;

    public class Bicycle {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            int x = in.nextInt();
            int y = in.nextInt();

            if(x % 2 == 0 || y % 2 != 0){
                out.println("yes");
            }else out.println("no");

            out.flush();
        }
    }

