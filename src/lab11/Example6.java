package lab11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*Записать в файл целые числа
прочитать в прямом и обратном порядке
получить инфу о файле и указателе до ввода и после ввода
сортировать по возрастанию в файле

По заданию 1 тип int заменили на double
 */
public class Example6 {
    public static void main(String[] args) {
        try{
            File folder = new File("C:\\Users\\Анна\\Downloads\\NewFolder");
            if(!folder.exists())
                folder.mkdir(); //создать папку, если она не существует

            File f1 = new File("C:\\Users\\Анна\\Downloads\\NewFolder\\example6.txt");
            f1.createNewFile();

            Scanner in = new Scanner(System.in);

            System.out.print("How many numbers would you like to add to file? :  \n ");
            double count = in.nextDouble(); //ввести количество чисел

            //открыть файл для чтения И записи
            RandomAccessFile rf = new RandomAccessFile(f1, "rw");
            System.out.println("Original file size in bytes is : " + rf.length() + "; pointer is at "
                    + rf.getFilePointer() + " byte");
            System.out.println("Input numbers: ");
            for(int i = 0; i < count; i++){
                rf.writeDouble(in.nextDouble()); //запись числа в файл. каждое число типа int равно 4 байта
            }
            System.out.println("New file size in bytes is " + rf.length() + "; pointer is at "
                    + rf.getFilePointer() + " byte");
            System.out.println("Number of bytes per 1 value = " + rf.length() / count);
            rf.close();

            //открыть файл для чтения
            rf = new RandomAccessFile(f1,"r");
            //читаем числа из файла, выводим на экран
            System.out.println("\n Numbers in file: ");
            for(int i = 0; i < count; i++){
                rf.seek(i*4); //переводим указатель на текущее число
                System.out.println("Number: " + i + ": " + rf.readDouble()); }

            System.out.println("Numbers in reversed order: ");
            for(double i = count-1; i >= 0; i--){
                rf.seek((long) (i*4));
                System.out.println("Number " + i + ": " + rf.readDouble());
            }

            rf.seek(rf.getFilePointer()-4); //перевод указателя на последнее число
            System.out.println("Total amount of numbers in file: " + rf.length()/4 + ", last number = " + rf.readDouble());

            //поиск заданного числа в файле, определение его номера
            System.out.println("Write the number, which you need to find in a file: ");
            double x = in.nextDouble();
            int kol = 0; //количество искомых чисел в файле
            for(int i = 0; i < count; i++){
                rf.seek(i*4);
                double number = rf.readDouble();
                if(number == x){
                    kol++;
                    System.out.println("Number " + i + ", ");
                }
            }
            System.out.println("Total amount of searched numbers = " + kol);
            rf.close();

            //Сортировка чисел в файле "пузырьком". Открыть файл для чтения и записи
            rf = new RandomAccessFile(f1, "rw");

            for(int k = 0; k < count; k++){ //номер просмотра
                for(int i = 0; i < count - k -1; i++){ //номер числа
                    rf.seek(i*4); //переход к итому числу
                    double num1 = rf.readDouble(); // прочитать итый и следующий элементы в переменные
                    double num2 = rf.readDouble();

                    if(num1 > num2){ //сортировка по возрастанию
                        rf.seek(i*4); //вернуть указатель на итое место
                        rf.writeDouble(num2);
                        rf.writeDouble(num1);
                    }
                }
            }

            System.out.println("\n Numbers are sorted in a file: ");
            for(int i = 0; i < count; i++) {
                rf.seek(i*4);
                System.out.println(" " + rf.readDouble());
            }
            rf.close();
        }catch (IOException e){
            System.out.println("End of file " + e);
        }
    }
}
