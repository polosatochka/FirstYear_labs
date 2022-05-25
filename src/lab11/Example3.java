package lab11;

import java.io.IOException;
import java.io.Reader;

/*
Вывести инфу из трех источников. Указать кодировку для кириллицы.
 */
public class Example3 {
    public static void readAllByBytes(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read(); //читать один байт
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.println("\n\n" + "end of source");
                break;
            }
        }
    }
}
