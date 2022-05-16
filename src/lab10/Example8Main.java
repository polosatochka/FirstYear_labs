package lab10;

import java.io.*;
import java.net.*;

import static lab10.Example8.readAllByByte;

public class Example8Main {
    public static void main(String[] args) {
        try{
            //Связать файл с потоком
            InputStream inFile = new FileInputStream("C:\\Users\\Анна\\Downloads\\example1.txt");
            Reader rFile = new InputStreamReader(inFile, "cp1251");

            readAllByByte(rFile);
            System.out.println("\n\n\n");
            inFile.close();
            rFile.close();

            //Связать с потоком вебстраницу

            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl = new InputStreamReader(inUrl, "cp1251");

            readAllByByte(rUrl);
            System.out.println("\n\n\n");
            inUrl.close();
            rUrl.close();

            //Связать с потоком массив типа байт
            InputStream inArray = new ByteArrayInputStream(new byte[] {5,8,3,9,11});
            Reader rArray = new InputStreamReader(inArray, "cp1251");

            readAllByByte(rArray);
            System.out.println("\n\n\n");
            inArray.close();
            rArray.close();
        }catch (IOException e){
            System.out.println("Извините, ошибочка вышла: " + e);
        }
    }
}

/*Отличие в работе программ примеров 7 и 8 заключается в следующем.
В примере 7 создается два потока, один для чтения и второй для записи.
Данные из одного файла копируются в строковую переменную, как во временное хранилище - "буфер",
после чего из этого буфера данные записываются во второй файл.

В примере 8 создается также два потока, но один из них байтовый, а другой символьный.
С помощью метода счиьываются побайтово данные из файла в символьном потоке.
Таким образом, в 7 примере в основе программы лежит принцип временного хранения данных,
а в 8 примере - конвертация байтов в символы после чтения.
 */
