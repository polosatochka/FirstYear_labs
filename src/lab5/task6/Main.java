package lab5.task6;

public class Main {

    public static void main(String[] args) {

        Minandmax mmx = new Minandmax();

        //Присвоить значение через конструктор с двумя аргументами
        Minandmax mmx1 = new Minandmax(10, 25);

//       Присвоить значение через конструктор с одним аргументом
        Minandmax mmx2 = new Minandmax(50);

//       Присвоить значение через метод с двумя параметрами
        mmx.set(7, 16);

//       Присвоить значение через метод с одним параметром
        mmx.set(60);

//       Вывести значения полей
        mmx.showvalue();


    }
}
