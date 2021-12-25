//Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
// Используете кодовую таблицу символов.
// При запуске программы в консоль необходимо вывести сообщение:
// «Введите текст для шифрования», после ввода текста,
// появляется сообщение: «Введите ключ». После того как введены все данные,
// необходимо вывести преобразованную строку с сообщением
// «Текст после преобразования : ». Далее необходимо задать вопрос пользователю:
// «Выполнить обратное преобразование? (y/n)», если пользователь вводит «y»,
// тогда выполнить обратное преобразование.
// Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
// Если пользователь вводит что-то другое, отличное от «y» или «n»,
// то программа ему выводит сообщение: «Введите корректный ответ».


package lab4;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        System.out.println("Введите текст для шифрования:");

        Scanner in = new Scanner(System.in);

        String original = in.nextLine();
        char[] shifr = new char[original.length()];

        System.out.println("Введите ключ:");
        int key = in.nextInt();

        for (int i = 0; i < original.length(); i++) {
            shifr[i] = (char) (original.charAt(i) + key);
        }

        System.out.println("Текст после преобразования: " + new String(shifr));

        Scanner id = new Scanner(System.in);

        System.out.println("Выполнить обратное преобразование? yes/no?:");
        String answer = id.nextLine();

        char[] oldMessage = (shifr);
        char[] decoded = new char[shifr.length];

        if ("yes".equals(answer))
            for (int j = 0; j < shifr.length; j++) {
                decoded[j] = (char) (oldMessage[j] - key);
                if(j == shifr.length-1){
                    System.out.println("После обратного преобразования: " + new String(decoded));
                }
            }
        else if ("no".equals(answer)) {
            System.out.println("До скорых встреч!");
        }
        else
            System.out.println("Выберите yes или no, пожалуйста! Выполнить обратное преобразование?");
    }
}