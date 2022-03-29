package lab8.task6;

public class MainNode {

    public static void main(String[] args) {
        //создать список с головы
        Node head = Node.createHead();
        Node.toStringMethod("метод: createHead", head);
        //создать список с хвоста
        Node head2 = Node.createTail();
        Node.toStringMethod("метод: createTail", head2);
        //добавить элемент в начало списка
        Node newHead = Node.addFirst(100, head);
        Node.toStringMethod("newHead", newHead);
        //добавить элемент в конец списка
        Node.addLast(200, newHead);
        Node.toStringMethod("newTail", newHead);
        //добавить элемент в указанное место
        Node.insert(300, newHead, 3);
        Node.toStringMethod("insert", newHead);
        //удалить голову
        Node newHeadAfterCut = Node.removeFirst(newHead);
        Node.toStringMethod("removeFirst", newHeadAfterCut);
        //удалить хвост
        Node.removeLast(newHeadAfterCut);
        Node.toStringMethod("removeLast", newHeadAfterCut);
        //удалить элемент из указанного места
        Node.remove(newHeadAfterCut, 2);
        Node.toStringMethod("remove", newHeadAfterCut);

    }
}
