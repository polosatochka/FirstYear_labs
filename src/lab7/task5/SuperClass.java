package lab7.task5;

public class SuperClass {

    //Закрытое текстовое поле
    private String txt;

    //Конструктор с тектовым параметром
    public SuperClass(String t) {
        this.txt = t; }

    //Конструктор по умолчанию
    SuperClass(){}

    //Сеттер для поля
    public void setTxt(String txt) {
        this.txt = txt;}

    //Геттер для поля
    public String getTxt() {
        return txt;}

    //Метод отображает название класса и значение поля
    public void showClassNameAndFieldValue(){
        System.out.println("Имя класса: " + this.getClass().getSimpleName() + "\n" + "Значение поля txt: " +
                this.getTxt());
    }
}
