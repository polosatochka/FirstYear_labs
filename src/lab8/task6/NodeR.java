package lab8.task6;

public class NodeR {

    // с рекурсией

    //описать элемент
    public int value;
    public NodeR next;

    //конструктор
    public NodeR(int value, NodeR next){
        this.value = value;
        this.next = next;}

    public NodeR(){

    }

    //метод ввод с головы
    public static void createHeadRec(NodeR head, NodeR tail, int size){

        if(head != null){
            tail = head;}

        if(size != 5){
            tail.next = new NodeR(size + 1, null);
            tail = tail.next;
            createHeadRec(null, tail,size + 1);}
    }

    //метод ввод с хвоста
    public static NodeR createTailRec(NodeR head, int size){

        if(size != -1){
            head = new NodeR(size, head);
            head = createTailRec(head, size-1); }
        return head; }


    public static void toStringR(NodeR head, NodeR ref1){

        if (ref1 != null) {
            System.out.println("" + "value = " + ref1.value + "; next = " + ref1.next);
            ref1 = ref1.next;
            toStringR(head, ref1);
        }
    }

}
