package lab11;
//Чтение из одного файла и запись в другой посимвольно
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader("C:\\Users\\Анна\\Downloads\\SampleFile.txt");
            out = new FileWriter("C:\\Users\\Анна\\Downloads\\WriteHere.txt", true);

            int oneByte; //сюда считываются данные
            while ((oneByte = in.read()) != -1){
                out.write((char)oneByte); //запись с уничтожением предыдущей информации
                out.append((char)oneByte); //запись с добавлением данных в конец
                System.out.print((char)oneByte);
            }
        }catch (IOException e){
            System.out.println("Ошибочка...");
        }
        finally {
            in.close();
            out.close();
        }
    }
}
