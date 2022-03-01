package lab7.task2;

public class SuperClass {
    //Закрытое текстовое поле
    private String str;


    //Метод, присваивающий значение полю без параметров
    public void setValue(){
        this.str = str; }

    //Метод, присваивающий значение полю с одним параметром
    public void setValue(String str) {
        this.str = str; }

    //Геттер для закрытого поля
    public String getStr() {
        return str; }

    //Метод, возвращающий длину строки
    public int line() {
        return str.length();
    }

    //Конструктор с одним параметром
    SuperClass(String str1){
        this.str = str1;
    }
    //Конструктор по умолчанию
    SuperClass(){
    }
}
