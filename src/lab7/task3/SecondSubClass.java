package lab7.task3;

public class SecondSubClass extends SubClass {
    //Открытое текстовое поле
    public String words;

    //Метод с 3 параметрами для присваивания значений полям
    public void setValues(int number, char chr, String txt){
        super.setValues(number, chr);
        this.words = txt; }

    public SecondSubClass(int x, char s, String t) {
        super(x, s);
        this.words = t; }

    public String getWords() {
        return words;
    }

    @Override
    public String toString() {
        String classNameAndFieldValue;
        classNameAndFieldValue = "Имя второго подкласса " + this.getClass().getSimpleName() + "\n"
                +"Значение поля numbers: " + this.getNumbers() + "\n" +
                "Значение поля symbols: " + this.getSymbols() + "\n" +
                "Значение поля words: " + this.getWords();
        return classNameAndFieldValue; }
}
