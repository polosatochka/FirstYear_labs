package lab7.task5;

public class SubTwo extends SuperClass {

    //защищенное символьное поле
    private char chr;

    //конструктор с двумя параметрами
    public SubTwo(String t, char chr) {
        super(t);
        this.chr = chr; }

    //Сеттер для символьного поля
    public void setChr(char chr) {
        this.chr = chr; }

    //Геттер для символьного поля
    public char getChr() {
        return chr; }

    //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void showClassNameAndFieldValue(){
        System.out.println("Имя класса: " + this.getClass().getSimpleName() + "\n" + "Значение поля txt: " +
                this.getTxt() + "\n" +"Значение поля chr: " + this.getChr()); }
}
