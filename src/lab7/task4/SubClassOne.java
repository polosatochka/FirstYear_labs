package lab7.task4;

public class SubClassOne extends SuperClass {

    //Открытое текстовое поле
    public String text;

    //Конструктор с 2мя параметрами
    public SubClassOne(String t, char s) {
        super(s);
        this.text = t; }

    //Конструктор по умолчанию
    SubClassOne(){}

    //Конструктор для создания копии
    SubClassOne(SubClassOne middle){
        this.symb = middle.symb;
        this.text = middle.text; }
}
