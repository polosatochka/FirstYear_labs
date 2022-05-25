package lab11;

import java.io.*;
import java.net.URL;

import static lab11.Example3.readAllByBytes;


public class Example3Main {
    public static void main(String[] args)  {
        try{
            //Связать файл с потоком
            InputStream inFile = new FileInputStream("C:\\Users\\Анна\\Downloads\\file1.txt"); //байтовый поток
            Reader rFile = new InputStreamReader(inFile, "cp1251"); //символьный поток

            readAllByBytes(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            //Связать интернет-страницу с потоком
            InputStream inUrl = new URL("https://www.google.com/").openStream(); //байтовый поток
            Reader rUrl = new InputStreamReader(inUrl, "cp1251"); //символьный поток

            readAllByBytes(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();

            //Связать массив с потоком
            InputStream inArray = new ByteArrayInputStream(new byte[] {1,3,5,6,8,10});
            Reader rArray = new InputStreamReader(inArray, "cp1251");

            readAllByBytes(rArray);
            System.out.println("\n\n\n");
            inArray.close();
            rArray.close();
        }catch (IOException e){
            System.out.println("Ошибочка: "  + e);}
    }
}

/* Отличие в работе прорграмм в примерах 2 и 3 заключается в том, что во 2м примере
считываются и записываются данные построчно на основе символьных потоков с использованием буфера,
а в 3м примере считываются и выводятся на экран данные на основе байтовых потоков, которые замем
конвертируются в символьные */