package lab11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Файл с произвольным доступом.
Записать инфу о фильмах.
-название
-год выпуска
-страна
-жанр
-стоимость проката
Задать кол-во фильмов с клавиатуры.
Создать второй файл. Переписать в него инфу о фильмах в России.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {

        try{
            File f1 = new File("C:\\Users\\Анна\\IdeaProjects\\AnnaHW\\Films.txt");
            if(!f1.exists()){
                f1.createNewFile();}

            RandomAccessFile rf = new RandomAccessFile(f1, "rw"); //чтение и запись

            Scanner in = new Scanner(System.in, "cp1251");
            System.out.print("Input total number of films to write into the file: ");

            int total = in.nextInt();
            in.nextLine(); //очистка буфера после ввода числа

            String title, country, genre;
            int releaseDate;
            int boxOffice;

            //Запись информации о фильмах
            for(int i = 0; i < total; i++){
                System.out.print("Input film title: ");
                title = in.next();
                rf.seek(rf.length()); //перейти в конец файла
                rf.writeUTF(title);
                for(int j = 0; j < 20 - title.length(); j++){
                    rf.writeByte(0); //добавить байтов до 20 цифрой 0
                }

                System.out.print("Input release year: ");
                releaseDate = in.nextInt();
                in.nextLine(); //очистка буфера
                rf.writeInt(releaseDate);

                System.out.print("Input country: ");
                country = in.next();
                rf.writeUTF(country);
                for(int j = 0; j < 20 - country.length(); j++){
                    rf.writeByte(0); //добавить байтов до 20 цифрой 0
                }

                System.out.print("Input genre: ");
                genre = in.next();
                rf.writeUTF(genre);
                for(int j = 0; j < 20 - genre.length(); j++){
                    rf.writeByte(0); //добавить байтов до 20 цифрой 0
                }

                System.out.print("Input how much the film has earned in billions of $: ");
                boxOffice = in.nextInt();
                in.nextLine(); //очистка буфера
                rf.writeDouble(boxOffice);
            }
            rf.close();

            rf = new RandomAccessFile(f1,"r");

            //Создание второго файла
            File f2 = new File("C:\\Users\\Анна\\IdeaProjects\\AnnaHW\\NewFilms.txt");
            if(!f2.exists()){
                f2.createNewFile();}

            //Чтение и запись информации о фильмах во второй файл
            RandomAccessFile rff = new RandomAccessFile(f2,"rw");

            rf.seek(0); //в начало файла
            for(int i = 0; i < total; i++){

                title = rf.readUTF();
                for (int j = 0; j < 20-title.length(); j++)
                    rf.readByte();
                System.out.println("Название: " + title);

                releaseDate = rf.readInt();
                System.out.println("Год выпуска: " + releaseDate);


                country = rf.readUTF();
                for (int j = 0; j < 20-country.length(); j++)
                    rf.readByte();
                System.out.println("Страна: " + country);


                genre = rf.readUTF();
                for (int j = 0; j < 20-genre.length(); j++)
                    rf.readByte();
                System.out.println("Жанр: " + genre);


                boxOffice = rf.readInt();
                System.out.println("Кассовые сборы: " + boxOffice);

                if(country.equals("Russia")){
                    rff.writeUTF(title);
                    rff.writeInt(releaseDate);
                    rff.writeUTF(country);
                    rff.writeUTF(genre);
                    rff.writeInt(boxOffice);
                }

                System.out.println("-------------------------------");
                }
            rf.close();
            rff.close();
        }catch (IOException e){
            System.out.println("Error 1");
            e.printStackTrace();
        }catch (InputMismatchException ee){
            System.out.println("Error 2");
            ee.printStackTrace();
        }
    }
}
