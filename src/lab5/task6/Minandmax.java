//Напишите программу с классом, в котором есть два закрытых целочисленных поля
// (назовем их max и min). Значение поля max не может быть меньше значения поля min.
// Значения полям присваиваются с помощью открытого метода.
// Метод может вызываться с одним или двумя целочисленными аргументами.
// При вызове метода значения полям присваиваются так:
// сравниваются текущие значения полей и значения аргументов, переданных методу.
// Самое большое из значений присваивается полю max,
// а самое маленькое из значений присваивается полю min.
// Предусмотрите конструктор, который работает по тому же принципу,
// что и метод для присваивания значений полям.
// В классе также должен быть метод, отображающий в консольном окне значения полей объекта.

package lab5.task6;

public class Minandmax {

    private int min;
    private int max;

    //    Метод с двумя целочисленными параметрами
    public void set (int a, int b) {

        if(a>b){
            max = a;
            min = b;
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }
        else if(b>a){
            max = b;
            min = a;
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }
    }

//    Метод с одним целочисленным параметром

    public void set (int c){
        max = c;
        if(max<min){
            max = min;
            min = c;
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }
    }

    //    Конструктор с двумя параметрами
    public Minandmax (int a, int b){
        this.set(a, b);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    //    Конструктор с двумя параметрами
    public Minandmax(int c){
        this.set(c);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    //    Пустой конструктор
    public Minandmax(){};


    //    Этот метод отображает конечные значения полей
    public void showvalue (){
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

}