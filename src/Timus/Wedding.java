package Timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Wedding {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int friends = in.nextInt();
        ArrayList<String> allAnswers= new ArrayList<>();
        int price = 100;

        if( friends <= 20 || friends >= 1){
            for(int i = 0; i <= friends; i++){

                String answer = in.nextLine();
                allAnswers.add(answer);
            }}

        for(String plate : allAnswers){
            if(plate.contains("+one")){
                price += 200;
            }else { price += 100;}
        }

        if(price == 1300){
            System.out.println(price +=100);
        }else{ System.out.println(price); }

    }
}