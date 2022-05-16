package lab10;

import java.io.*;

//Прочитать и вывести на экран инфу из трех источников: файл на диске, вебстраница, массив типа байт.
//Указать кодировку для кириллицы
public class Example8 {
    public static void readAllByByte(Reader in) throws IOException {
        while (true){
            int oneByte = in.read(); //читать один байт
            if(oneByte != -1) {
                System.out.print((char)oneByte);
            }else{
                System.out.print("\n" + "the end");
                break;
            }
        }
    }
}
