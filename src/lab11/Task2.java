package lab11;

import java.io.*;

/*
-создать текстовый файл с текстом
-переписать построчно слова в другой файл так, что
 +они начинаются с той же буквы что и у первого слова
 +указать номер строки
 +указать количество выбранных слов
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //Создать потоки чтения и записи
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C:\\Users\\Анна\\Downloads\\Wood.txt")));

            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\Анна\\Downloads\\Copy.txt")));

            int lineCounter = 0;
            String w;
            while((w = br.readLine()) != null){
                lineCounter++;
                int numberOfWords = 0;

                String [] words = w.split(" ");
                bw.write(lineCounter + ": ");
                char firstLetter = words[0].charAt(0);

                for(String word : words){
                    String fL = String.valueOf(word.charAt(0));
                    boolean check = fL.equalsIgnoreCase(String.valueOf(firstLetter));
                    if(check == true){

                        bw.write( word + " ");
                        numberOfWords++;
                    }
                }

                bw.write("; Количество выбранных слов: " + numberOfWords);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Упс, ошибочка"); }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
