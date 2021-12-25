//Напишите программу с классом, у которого есть два символьных поля и метод.
// Он возвращает результат, и у него нет аргументов.
// При вызове метод выводит в консольное окно все символы из кодовой таблицы,
// которые находятся «между» символами, являющимися значениями полей объекта
// (из которого вызывается метод). Например, если полям объекта присвоены значения
// ‘A’ и ‘D’, то при вызове метода в консольное окно должны выводиться все символы
// от ‘A’ до ‘D’ включительно.

package lab5.task2;

public class Task_2 {

    private char s1;
    private char s2;

//    public char getS1() {
//        return s1;
//    }

    public void setS1(char s1) {
        this.s1 = s1;
    }

//    public char getS2() {
//        return s2;
//    }

    public void setS2(char s2) {
        this.s2 = s2;
    }

    public void showArray(){

        int i;
        int j;

        System.out.print("Symbols from " + s1+" to " + s2 + ": ");

        if(s1<s2) {
            for (i = s1; i <= s2; i++) {
                System.out.print((char) i + " ");
            }
        }
        else if(s2<s1){
            for(j = s2; j <= s1; j++){
                System.out.print((char) j + " ");
            }
        }
    }
}