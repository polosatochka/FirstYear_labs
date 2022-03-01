package lab7.task2;

public class SubClass extends SuperClass {

    public int number;

    //Конструктор подкласса с двумя параметрами текстовым и целочисленным
    SubClass(String str1, int num) {
        super(str1);
        this.number = num;
    }

    //Метод присваивает значение полю без параметров
    @Override
    public void setValue() {
        super.setValue();
        this.number = number; }

    //Метод с текстовым параметром присваивает значение полю
    @Override
    public void setValue(String str) {
        super.setValue(str); }

    //Метод с целочисленным параметром присваивает значение полю
    public void setValue(int n){
        this.number = n; }

    //Метод с целочисленным и текстовым параметром присваивает значение полю
    public void setValue(String str, int n){
        super.setValue(str);
        this.number = n; }

    public int getNumber() {
        return number;
    }
}
