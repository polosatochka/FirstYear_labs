package lab5.task5;

public class Main {

    public static void main(String[] args) {

        //Присвоить значение через конструктор без параметров
        Method method = new Method();

        //Присвоить значение через конструктор с целочисленным аргументом <100
        Method method2 = new Method(30);

        //Присвоить значение через конструктор с целочисленным аргументом >=100
        Method method3 = new Method(130);

        //Присвоить значение через метод без параметров
        method.setValue();

        //Присвоить значение через метод с параметром, который <100
        method2.setValue(10);

        //Присвоить значение через метод с параметром, который >=100
        method3.setValue(110);

        //Проверить значение поля
        method.checkValue();
        method2.checkValue();
        method3.checkValue();

    }
}