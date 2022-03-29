package lab8.task5;

public class MainNodeTailStart {

    public static void main(String[] args) {
        //начальное значение ссылки на голову

        NodeTailStart head = null;

        //добавить элементы перед головой-хвостом

        for (int i = 5; i >= 0; i--) {
            head = new NodeTailStart(i, head);
        }

        //распечатать элементы на экран

        NodeTailStart ref = head;
        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next; }
    }
}
