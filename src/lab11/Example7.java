package lab11;
/*Запись строк в файл и их чтение из файла с произвольным доступом (формат UTF-8) */

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        try{
            File folder = new File("C:\\Users\\Анна\\Downloads\\FolderSeven");
            if(!folder.exists())
                folder.mkdir();

            File f1 = new File("C:\\Users\\Анна\\Downloads\\FolderSeven\\Lines.txt");
            f1.createNewFile();

            Scanner in = new Scanner(System.in, "cp1251");
            System.out.println("Сколько строк надо записать в файл? \n");
            int count = in.nextInt();
            in.nextLine(); //очистка буфера после ввода числа

            RandomAccessFile rf = new RandomAccessFile(f1, "rw"); //чтение и запись
            rf.setLength(0);
            long leng = rf.length();
            System.out.println("Открыт файл размером " + leng + " байт");
            System.out.println("Введите строки: ");
            int lettersCount = 0; //счетчик букв

            //записать строки в файл
            for(int i = 0; i<count; i++){
                String s = in.nextLine();
                rf.writeUTF(s);
                lettersCount+= s.length();
            }
            leng = rf.length();
            System.out.println("Размер файла в байтах = " + leng);
            rf.close();

            //Открыть файл для чтения
            rf = new RandomAccessFile(f1, "r");
            //вывести строки из файла на экран
            System.out.println("Строки из файла: ");
            rf.seek(0);  //перевести указатель в начало файла
            for(int i = 0; i<count; i++)
                System.out.println("Строка " + i + " начинается с байта " + rf.getFilePointer()
                        + " - " + rf.readUTF() + " заканчивается байтом " + (rf.getFilePointer()-1));
                rf.close();
        }catch (IOException e){
            System.out.println("Конец файла " + e);
        }
    }
}
