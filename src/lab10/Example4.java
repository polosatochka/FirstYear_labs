package lab10;

import java.io.*;
import java.util.Scanner;

//Перезапись вещественных чисел из первого файла во второй
public class Example4 {
    public static void main(String[] args) {
        try {
            //Создать исходный файл, записать в него числа типа float
            File f1 = new File("C:\\Users\\Анна\\Downloads\\file1.txt");
            f1.createNewFile();

            Scanner in = new Scanner(System.in, "cp1251");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = in.nextInt();

            System.out.println("Введите числа: ");
            for (int i = 0; i < count; i++)
                wr.writeFloat(in.nextFloat());
            wr.flush();
            wr.close();

            //Создать второй файл, переписать в него числа из первого
            File f2 = new File("C:\\Users\\Анна\\Downloads\\file2.txt");
            f2.createNewFile();

            //поток для чтения из исходного файла file1
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            //поток для записи во второй файл
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Число = " + (float) number);
                }
            } catch (EOFException e) {
            }
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}