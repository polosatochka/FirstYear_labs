package lab7.task4;

public class SubClassTwo extends SubClassOne {

    //Открытое целочисленное поле
    public int num;

    //Конструктор с 3мя параметрами
    public SubClassTwo(String t, char s, int n) {
        super(t, s);
        this.num = n; }

    //Конструктор по умолчанию
    SubClassTwo(){}

    //Конструктор для создания копии
    SubClassTwo(SubClassTwo bottom){
        this.symb = bottom.symb;
        this.text = bottom.text;
        this.num = bottom.num; }
}
