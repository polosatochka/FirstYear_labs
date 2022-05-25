package lab10;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static lab10.Example2.readAllByByte;

public class Example2Main {

    public static void main(String[] args) throws IOException {

        try{
            //С потоком связан файл
            InputStream inFile = new FileInputStream("C:\\Users\\Анна\\Downloads\\file1.txt"); //созданный и заполненный файл
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            //С потоком связана интернет-страница
            InputStream inURL = new URL("https://www.google.com").openStream();
            readAllByByte(inURL);
            System.out.println("\n\n\n");
            inURL.close();

            //С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] {8,0,6,1,5}); //создать массив
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        }catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}
