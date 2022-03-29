package lab8.task6;

public class Node {

    //с использованием цикла

    //описать элемент
    public int value;
    public Node next;

    //конструктор
    Node(int value, Node next){
        this.value = value;
        this.next = next;}

    //метод ввод с головы
    public static Node createHead() {
        //создать первый узел голову-хвост списка
        Node head = new Node(0,null);
        Node tail = head;

        //добавить элементы - продолжить хвост
        for (int i = 0; i < 5; i++){
            tail.next = new Node(i+1, null);
            tail = tail.next;} //указатель на новый хвост

        return head; }

    //метод ввод с хвоста
    public static Node createTail(){
        //начальное значение ссылки на голову
        Node head = null;

        //добавить элементы перед головой-хвостом
        for (int i = 5; i >= 0; i--) {
            head = new Node(i, head);}

        return head;}

    //метод вывод элементов списка
    public static void toStringMethod(String message, Node head){
        Node ref = head;
        System.out.println("--------------------");
        System.out.println(message);
        while (ref != null){
            System.out.println("" + "value = " + ref.value + "; next = " + ref.next);
            ref=ref.next;}
    }

    //метод добавления элемента в начало списка
    public static Node addFirst(int value, Node head){
        return new Node(value,head);}

    //метод добавления элемента в конец списка
    public static void addLast(int value, Node head){
        Node ref = head;

        while(ref.next != null){
            ref = ref.next;}
        ref.next = new Node(value, null);
    }

    //метод добавления элемента в указанное место
    public static void insert(int value, Node head, int place){
        Node newNode = new Node(value, null);
        Node ref = head;
        int k = 1;

        //поиск узла для вставки
        while(ref != null && (k < place)){
            ref = ref.next;
            k++;}

        //перебросить ссылки при вставке
        newNode.next = ref.next.next;
        ref.next = newNode;}

    //метод удаления головы
    public static Node removeFirst(Node head){
        head = head.next;
        return head;}

    //метод удаления хвоста
    public static void removeLast(Node head){
        Node ref = head;

        while(ref.next.next != null){
            ref=ref.next;}

        ref.next = null;}

    public static void remove(Node head, int place){
        Node ref = head;
        int k = 1;

        //поиск узла, который стоит перед удаляемым
        while(ref.next != null&& (k < place)){
            ref = ref.next;
            k++;}
        //перебросить ссылку на следующий после удаляемого элемент
        ref.next = ref.next.next;}
}
