package lab8.task6;

public class MainNodeR {

    public static void main(String[] args) {

        //создать список с головы
        //первый узел голова-хвост
        NodeR head = new NodeR(0, null);
        NodeR.createHeadRec(head, new NodeR(), 0);

        //ту стринг
        NodeR ref1 = head;
        System.out.println("------------------");
        System.out.println("метод: createHeadRec");
        NodeR.toStringR(head, ref1);


        //создать список с хвоста
        NodeR head2 = NodeR.createTailRec(null, 5);

        //ту стринг второй
        NodeR ref2 = head2;
        System.out.println("------------------");
        System.out.println("метод: createTailRec");
        NodeR.toStringR(head2, ref2);

    }
}
