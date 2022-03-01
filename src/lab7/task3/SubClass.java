package lab7.task3;

public class SubClass extends SuperClass {
    //Открытое символьное поле
    public char symbols;

    //Перегруженный метод суперкласса для присваивания значений полям с 2 параметрами
    public void setValues(int number, char chr){
        super.setValues(number);
        this.symbols = chr; }

    //Конструктор с 2 параметрами
    public SubClass(int x, char s) {
        super(x);
        this.symbols = s;
    }

    SubClass(){ }

    public char getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        String subClassNameAndFieldValue;
        subClassNameAndFieldValue = "Имя первого подкласса " + this.getClass().getSimpleName() + "\n"
                + "Значение поля numbers: " + this.getNumbers() + "\n" +
                "Значение поля symbols: " + this.getSymbols();
        return subClassNameAndFieldValue; }
}
