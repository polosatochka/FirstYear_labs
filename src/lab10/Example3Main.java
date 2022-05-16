package lab10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static lab10.Example3.readAllByArray;

public class Example3Main {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Анна\\Downloads\\example01.txt";
        InputStream inFile = null; //до блока трай-кэтч чтобы не ограничивать область видимости

        try{
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        }catch (IOException e){
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        }finally {
            if(inFile != null){
                try{
                    inFile.close();
                }catch (IOException ignore) {  //No Operation - ничего не делать
                    /*NOP*/
                }
            }}
    }}
