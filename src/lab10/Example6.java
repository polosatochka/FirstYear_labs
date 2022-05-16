package lab10;

import java.io.*;

import static java.lang.System.in;

//Чтение данных в одном файле, а затем запись этих данных в другой файл посимвольно
public class Example6 {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("C:\\Users\\Анна\\IdeaProjects\\AnnaHW\\myfile.txt");
            out = new FileWriter("C:\\Users\\Анна\\IdeaProjects\\AnnaHW\\example1.txt", true);
            //Считывание и запись данных побайтно
            int oneByte; //сюда считываются данные
            while((oneByte = in.read()) != -1){
                out.write((char)oneByte); //запись данных (старые данные стираются)
                out.append((char)oneByte); //запись с добавлением в конец (данные остаются)
                System.out.print((char)oneByte);
            }
        }catch (IOException e){
            System.out.println("Извините, ошибочка вышла");
        }
        finally {
            in.close();
            out.close();
    }
    }
}
