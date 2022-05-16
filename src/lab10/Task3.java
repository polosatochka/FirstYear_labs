package lab10;

import java.io.*;

/*
Из текстового файла со строками литературного текста
переписать слова, которые начинаются с согласных
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        //Создать потоки чтения и вывода
        try{
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\Анна\\Downloads\\file1.txt"),"cp1251"));
            out = new PrintWriter("C:\\Users\\Анна\\Downloads\\file2.txt", "cp1251");

            //Переписать слова из первого файла во второй
            int lineCount = 0;
            String wordin;
             while ((wordin = br.readLine()) != null) {
                 lineCount++;

                 String[] words = wordin.split(" ");
                 out.print(lineCount + ": ");
                 int numOfWords = 0;
                 for (String word : words) {
                     if((word.charAt(0) != 'a')&&(word.charAt(0) != 'e')&&(word.charAt(0) != 'i')&&(word.charAt(0) != 'o')&&(word.charAt(0) != 'u')&&(word.charAt(0) != 'y')&&(word.charAt(0) != 'A')&&(word.charAt(0) != 'E')&&(word.charAt(0) != 'I')&&(word.charAt(0) != 'O')&&(word.charAt(0) != 'U')&&(word.charAt(0) != 'Y')) {
                         out.print(word + " ");
                         numOfWords++;
                     }
                 }

                 out.print("; Количество выбранных слов: " + numOfWords);
                 out.println();
             }
        }catch (IOException e){
            System.out.println("Упс, ошибочка");
        }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}
