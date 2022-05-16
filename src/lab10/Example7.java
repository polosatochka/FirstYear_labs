package lab10;

import java.io.*;

//Чтение данных из одного файла, запись их в другой файл построчно через буфер в 1 kB
public class Example7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try{
            //Создать файловые символьные потоки чтения и записи
            br = new BufferedReader(new FileReader("C:\\Users\\Анна\\Downloads\\example1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("C:\\Users\\Анна\\Downloads\\example2.txt"));

            int lineCount = 0; //счетчик строк
            String s;

            //Переписать данные из одного файла в другой
            while((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); //переход на новую строку
            }
        }catch (IOException e){
            System.out.println("Ошибка");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
