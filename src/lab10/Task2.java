package lab10;
/*1. Создать файл
2. Записать в файл 2 строки в UTF8 и 5 чисел типа double
3.Переписать во второй файл вторую строку и положительные числа
 */

import java.io.*;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Создать файл
        try {
            File f1 = new File("FileOne.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Файл создан");
                System.out.println("Полный путь: " + f1.getAbsolutePath());
            }
            //Записать в файл 5 вещественных чисел и 2 строки
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));

            double [] nums = {0.1, -0.2, 0.3, -0.4, 0.5};
            String s1 = "What do you do when it rains?";
            String s2 = "― The captain answered frankly. I get wet. ― Joseph Heller, Catch-22";

            ArrayList<String> quote = new ArrayList<>();
                quote.add(s1);
                quote.add(s2);

            for(int i = 0; i<nums.length; i++){
                wr.writeDouble(nums[i]); }
            wr.writeUTF(s1);
            wr.writeUTF(s2);

            wr.flush();
            wr.close();

            //Создание второго файла
            File f2 = new File("FileTwo.txt");
            f2.createNewFile();
            if (f2.exists()) {
                System.out.println("Второй файл создан");
                System.out.println("Полный путь: " + f2.getAbsolutePath());
            }

            //Создать поток для чтения из первого файла
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));

            //Создать поток для записи во второй файл
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try {
                for(int y = 0; y < nums.length; y++){
                    double number = rd.readDouble();
                    if (number > 0) {
                        wr.writeDouble(number);
                        System.out.println("Число " + number); }
                }
                String line2 = quote.get(1);
                wr.writeUTF(line2);
                System.out.println("Строка: " + line2);
            }catch(EOFException e){
            System.out.println("Ошибочка вышла: " + e); }

        wr.flush();
        wr.close();
        rd.close();
    }catch(IOException ee){
        System.out.println("End of file");}
}
}
