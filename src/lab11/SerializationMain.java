package lab11;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializationMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            Scanner in = new Scanner(System.in);
            ArrayList<Serialization3> films = new ArrayList<>();

            File f1 = new File("C:\\Users\\Анна\\Downloads\\Movies");
            f1.createNewFile();

            //Создать поток для записи объекта в первый файл
            FileOutputStream fos = new FileOutputStream(f1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);



            System.out.println("Сколько фильмов нужно записать?");
            int total = in.nextInt();

            Serialization3 movie;


            for(int j = 0; j<total; j++) {

                movie = new Serialization3();
//                for (int i = 0; i < total; i++) {
//                Serialization3 movie = new Serialization3();
                //Информация о фильме
                System.out.print("Введите название фильма: ");
                movie.title = in.next();
                System.out.print("Введите год выпуска: ");
                movie.releaseYear = in.nextInt();
                System.out.print("Введите страну: ");
                movie.country = in.next();
                System.out.print("Введите жанр: ");
                movie.genre = in.next();
                System.out.print("Введите стоимость проката: ");
                movie.boxOffice = in.nextInt();
                films.add(movie);
            }
                for(Serialization3 film : films) {
                    System.out.println(film);
                    //Запись объекта в файл
                    oos.writeObject(film);
                }
                oos.flush();
                oos.close();

                File f2 = new File("C:\\Users\\Анна\\Downloads\\RussianMovies.txt");
                f2.createNewFile();

                //Прочитать данные из файла
                FileInputStream fis = new FileInputStream(f1);
                ObjectInputStream oin = new ObjectInputStream(fis);

                //Создать поток для записи объекта во второй файл
                FileOutputStream foos = new FileOutputStream(f2);
                ObjectOutputStream ooos = new ObjectOutputStream(foos);

                for(Serialization3 f : films) {
                    f = (Serialization3) oin.readObject();
                    if (f.country.equals("Russia")) {
                        ooos.writeObject(f);

                        System.out.println("Название: " + f.title);
                        System.out.println("Год выпуска: " + f.releaseYear);
                        System.out.println("Страна: " + f.country);
                        System.out.println("Жанр: " + f.genre);
                        System.out.println("Стоимость проката:" + f.boxOffice);
                    }
                }
                ooos.flush();
                ooos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
