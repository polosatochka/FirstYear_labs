package lab8.task4;

public class MainNode {

    public static void main(String[] args) {
        //создать несвязанные узлы (элементы) с помощью конструктора

        Node node0 = new Node(0,null); //head
        Node node1 = new Node(1,null);
        Node node2 = new Node(2,null);
        Node node3 = new Node(3,null);
        Node node4 = new Node(4,null); //tail

        //связать узлы в список с помощью ссылок

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //вывести список

        Node ref = node0; //перемещение по списку через голову
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next; }
    }

}
