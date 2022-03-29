package lab8.task5;

public class MainNodeHeadStart {
    public static void main(String[] args) {
        //создать первй узел голову-хвост списка

        NodeHeadStart head = new NodeHeadStart(0,null);
        NodeHeadStart tail = head;

        //добавить элементы - продолжить хвост

        for (int i = 0; i < 5; i++){
            tail.next = new NodeHeadStart(i+1, null);
            tail = tail.next;  //указатель на новый хвост
        }

        //распечатать элементы на экран

        NodeHeadStart ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next; }
    }
}
