package lab7.task5;

public class SubOne extends SuperClass {

    //защищенное целочисленное поле
    private int x;

    //конструктор с двумя параметрами
    public SubOne(String t, int x) {
        super(t);
        this.x = x; }

    //Сеттер для целочисленного поля
    public void setX(int x) {
        this.x = x; }

    //Геттер для целочисленного поля
    public int getX() {
        return x; }

    //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void showClassNameAndFieldValue(){
        System.out.println("Имя класса: " + this.getClass().getSimpleName() + "\n" + "Значение поля txt: " +
                this.getTxt() + "\n" + "Значение поля x: " + this.getX());
    }
}
