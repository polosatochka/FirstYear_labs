package lab10;

import java.io.*;
import java.util.Scanner;

//Ввести с клавиатуры текст. Записать в файл в формате UTF8
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fname = in.nextLine();
        try{
            //Создать файл
            File f1 = new File(fname);
            f1.createNewFile(); //файл создан
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());

            System.out.println("Введите количество строк для записи в файл: ");
            int n = in.nextInt();

            //Создать поток для записи. Учитывать тип данных DataOutputStream
            //Передать ему в качестве параметра поток FileOutputStream
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            in.nextLine(); //очистка буфера

            for(int i =0; i < n; i++){
                System.out.println("Введите строку для записи в файл: ");
                String s = in.nextLine();
                dOut.writeUTF(s + "\n"); //для записи отдельных строк
            }
            dOut.flush();  //дописать данные на диск
            dOut.close();

            //Чтение и вывод данных из созданного файла
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true){
                System.out.println(dIn.readUTF());
            }
        }catch (Exception e){
            System.out.println("" + e);
        }
    }
}
