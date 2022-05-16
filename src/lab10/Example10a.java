package lab10;

import java.io.*;

public class Example10a {
    //Прочитать данные из одного файла, записать в другой с помощью PrintWriter
        public static void main(String[] args) throws IOException {
            BufferedReader br = null;
            PrintWriter out = null;

            try{
                //Создать потоки
                br = new BufferedReader(new InputStreamReader(
                        new FileInputStream("C:\\Users\\Анна\\Downloads\\example1.txt"), "cp1251"));
                out = new PrintWriter(System.out);

                //Переписать информацию
                int lineCount = 0;
                String s;

                while((s=br.readLine()) != null){
                    lineCount++;
                    out.println(lineCount + ": " + s);
                }
            }catch (IOException e){
                System.out.println("Извините, ошибочка вышла");
            }
            finally {
                br.close();
                out.flush();
                out.close();
            }
        }
    }

