package lab7.task2;

public class Main {

    public static void main(String[] args) {
        SuperClass Obj = new SuperClass("Я текст контруктора суперкласса");
        SubClass Obj2 = new SubClass("Я текст конструктора подкласса", 25);

        System.out.println(Obj.getStr());
        int howLong = Obj.line();
        System.out.println("Длина моей строки: " + howLong + " символ");

        String text = Obj2.getStr();
        System.out.println(text);
        System.out.println("Получил число " + Obj2.number);


        int howLong2 = Obj2.line();
        System.out.println("Длина моей строки: " + howLong2 + " символов");

    }
}
