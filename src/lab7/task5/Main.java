package lab7.task5;

public class Main {

    public static void main(String[] args) {

        SuperClass object1 = new SuperClass("Простой текст");
        object1.showClassNameAndFieldValue();

        System.out.println("----------------------------------------");

        SubOne object2 = new SubOne("Еще простой текст", 5);
        object2.showClassNameAndFieldValue();

        System.out.println("----------------------------------------");

        SubTwo object3 = new SubTwo("Снова простой текст", 'A');
        object3.showClassNameAndFieldValue();

        System.out.println("----------------------------------------");

        //Вызов через объектную переменную суперкласса
        object1 = object2;
        object1.showClassNameAndFieldValue();

        System.out.println("----------------------------------------");

        //Вызов через объектную переменную суперкласса
        object1 = object3;
        object1.showClassNameAndFieldValue(); }
}
