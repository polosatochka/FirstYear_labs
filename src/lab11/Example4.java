package lab11;
/*Прочитать данные из одного файла и записать в другой построчно с помощью
буферизации символьных потоков */

import java.io.*;

public class Example4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            //Поток для чтения
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\Анна\\Downloads\\file1.txt"), "cp1251"));

            //Поток для записи
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\Анна\\Downloads\\file2.txt"),"cp1251"));

            //Переписать инфу из одного файла во второй
            int lineCount = 0;
            String s;
            while((s= br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);//Запись без перевода строки
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Здесь ошибка");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
