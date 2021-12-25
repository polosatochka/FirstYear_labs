//Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать объекты
// без передачи аргументов,
// с передачей одного аргумента
// и с передачей двух аргументов.

package lab5.task3;

public class Spy {

    private int blacksuit;
    private int bomb;


    //Конструктор без передачи аргумента
    public Spy() {

        System.out.println("Сколько костюмов у шпионов?");
    }
    //Конструктор с передачей одного аргумента
    public Spy(int blacksuit) {
        this.blacksuit = blacksuit;
        System.out.println("Шпион Борис держит в шкафу " + this.blacksuit + " костюмов");
    }
    //Конструктор с передачей двух аргументов
    public Spy(int blacksuit, int bomb) {
        this.blacksuit = blacksuit;
        this.bomb = bomb;

        System.out.println("Шпион Наташа держит в шкафу " + this.blacksuit + " костюмов");
        System.out.println("А также " + this.bomb + " гранат замедленного действия");
    }
}