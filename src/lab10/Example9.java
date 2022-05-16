package lab10;
/*Прочитать данные из одного файла, записать в другой построчно
с помощью буферизации символьных потоков, основанных на байтовых файловых потоках.
 */

import java.io.*;

public class Example9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            //Создать поток для чтения и записи с учетом кодировки
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\Анна\\Downloads\\example1.txt"),"cp1251"));

            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\Анна\\Downloads\\example2.txt"), "cp1251"));

            //Переписать информацию из первого файла во второй
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s); //запись без перевода строки
                bw.newLine();//принудительный переход на новую строку
            }
        }catch (IOException e){
            System.out.println("Извините, ошибочка вышла");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
