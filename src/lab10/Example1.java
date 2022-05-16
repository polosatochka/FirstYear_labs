
//создание файлов и папок
package lab10;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try{
            //создать файл в текущей папке
            File f1 = new File("example1.txt");
            f1.createNewFile();
            if(f1.exists()){
                System.out.println("Файл создан");
                System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            }
            //создать файл на диске и вывести полный путь
            File f2 = new File("C:\\Users\\Анна\\Downloads\\example01.txt");
            f2.createNewFile();
            System.out.println("Полный путь второго файла:" + f2.getAbsolutePath());

            //создать несколько вложенных папок
            File f3 = new File("C:\\Users\\Анна\\Downloads\\newFolder\\secondFolder\\lastFolder");
            f3.mkdirs();
            System.out.println("Полный путь каталогов: " + f3.getAbsolutePath());
        }catch (Exception e){
            System.out.println("Произошла ошибка " + e);
        }
    }
}
