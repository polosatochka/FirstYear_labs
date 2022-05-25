package lab11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
Записать информацию о сотрудниках в файл
считать информацию из файла
 */
public class Example8 {
    public static void main(String[] args) {
        try{
            File folder = new File("C:\\Users\\Анна\\Downloads\\FolderEight");
            if(!folder.exists())
                folder.mkdir();

            File f1 = new File("C:\\Users\\Анна\\Downloads\\FolderEight\\Employees.txt");
            if(!f1.exists())
                f1.createNewFile();

            RandomAccessFile rf = new RandomAccessFile(f1, "rw"); //read and write
            long fSize = rf.length();
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество сотрудников для записи в файл: \n");

            int quantity = in.nextInt();
            in.nextLine(); //очитска буфера после ввода числа

            String surname, job;
            int salary;

            //Запись информации в файл
            for(int i = 0; i < quantity; i++){
                System.out.println("Введите фамилию: " + (i+1) + " сотрудника: ");
                surname = in.next();
                rf.seek(rf.length()); //find the end of the file
                rf.writeUTF(surname); //write down surname
                for(int j = 0; j<20-surname.length(); j++)
                    rf.writeByte(1); //добавление байтов до 20 любой цифрой, к примеру = 1

                System.out.println("Введите должность: ");
                job = in.next();
                rf.writeUTF(job); //write down job
                for(int j = 0; j<20-job.length(); j++)
                    rf.writeByte(1);

            System.out.println("Введите оклад: ");
            salary = in.nextInt();
            in.nextLine(); //clean Buffer
            rf.writeInt(salary); //
        }
            rf.close();
            //Чтение информации из файла
            rf = new RandomAccessFile(f1, "r");
            rf.seek(0); //переместить в начало файла
            System.out.println("Информация о сотрудниках");
            System.out.println("Фамилия \t\t Должность \t\t Оклад");
            for(int i = 0; i<quantity; i++){
                surname = rf.readUTF();
                for(int j = 0; j<20-surname.length(); j++)
                    rf.readByte();

                job = rf.readUTF();
                for(int j = 0; j<20-job.length(); j++)
                    rf.readByte();

                salary = rf.readInt();

                System.out.println(surname + "\t\t\t" + job + "\t\t\t" + salary);
            }
            rf.close();
    }catch (IOException e){
            System.out.println("Конец файла " + e);
        }
}}
