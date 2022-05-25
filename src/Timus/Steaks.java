package Timus;


import java.util.Scanner;

public class Steaks {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int order = in.nextInt();
        int k = in.nextInt();
        int sides = 2*order;

        int mins = 2;

        if(order <= k){
            System.out.println(mins);
        }else{
            if(sides % k == 0){
                System.out.println(sides / k);}
            else{System.out.println((sides / k+1));}
        }
    }
}