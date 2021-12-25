package lab5.task5;

public class Main {

    public static void main(String[] args) {

        //Присвоить значение через конструктор
        Method method = new Method(30);

        //Присвоить значение через метод с параметром, который <100
        method.meth(25);


        //Присвоить значение через метод с параметром, который >=100
        method.meth(125);

        //Присвоить значение через метод без параметров
        method.meth();

//        Проверить значение поля?
        method.check();

    }
}
