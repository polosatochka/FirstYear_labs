package lab7.task3;

public class SuperClass {

    //Открытое целочисленное поле
    public int numbers;

    //Метод с одним параметром присваивает значение полю
    public void setValues(int number) {
        this.numbers = number; }

    public int getNumbers() {
        return numbers;
    }

    // Конструктор с одним параметром
    public SuperClass(int x) {
        this.numbers = x; }

    SuperClass(){ }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Имя суперкласса " + this.getClass().getSimpleName() + "\n"
                + "Значение поля numbers: " + this.getNumbers();
        return superClassNameAndFieldValue; }
}
