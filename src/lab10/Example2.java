package lab10;

import java.io.IOException;
import java.io.InputStream;

public class Example2 {

    //метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while(true){
            int oneByte = in.read(); //чтение 1 байта
            if(oneByte != -1){  //признак отсутствия конца файла
                System.out.print((char) oneByte);
            }else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }




}
