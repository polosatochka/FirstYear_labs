package lab7.task4;

public class SuperClass {

    //Открытое символьное поле
    public char symb;

    //Конструктор с параметром
    public SuperClass(char s) {
        this.symb = s; }

    //Конструктор по умолчанию
    SuperClass(){ }

    //Конструктор для создания копии
    SuperClass(SuperClass top) {
        this.symb = top.symb; }
}
