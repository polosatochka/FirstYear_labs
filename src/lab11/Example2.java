package lab11;
//Чтение из одного файла и запись в другой построчно через буфер в 1 кБ

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            //Создать потоки чтения и записи
            br = new BufferedReader(new FileReader("C:\\Users\\Анна\\Downloads\\SampleFile.txt"), 1024);
            out = new BufferedWriter(new FileWriter("C:\\Users\\Анна\\Downloads\\WriteHere.txt"));

            int lineCounter = 0;
            String s;

            //Переписать инфу из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCounter++;
                System.out.println(lineCounter + ": " + s);
                out.write(s);
                out.newLine(); //переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
