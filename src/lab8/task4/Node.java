package lab8.task4;

public class Node {

    //Класс отражает структуру одного элемента списка

    public int value; //значение
    public Node next; // ссылка на следующий элемент(узел)

    Node(int value, Node next){ //конструктор класса
        this.value = value;
        this.next = next; }
}
