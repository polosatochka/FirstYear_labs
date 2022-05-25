package lab11;
//Считать из одного файла и записать в другой с помощью PrintWriter

import java.io.*;

public class Example5a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;

        try{
            //Создать поток чтения и записи
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\Анна\\Downloads\\file1.txt"), "cp1251"));

            out = new PrintWriter(System.out);//<-- системный выходной поток

            //Переписать инфу из первого файла во второй
            int lineCounter = 0;
            String s;

            while((s= br.readLine()) != null){
                lineCounter++;
                out.println(lineCounter + ": " + s);
            }
        }catch (IOException e){
            System.out.println("Какая то ошибка"); }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}