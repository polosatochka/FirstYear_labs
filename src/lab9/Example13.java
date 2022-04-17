package lab9;

public class Example13 {

    public static void main(String[] args) {
        System.out.println("13. Работа с аргументами метода main"); //установили методу main два аргумента : 0, 55
        try{//контролируем блок кода, который может вызвать ошибку
            int i = args.length;
            System.out.println("размер массива = " + i);
            int h = 10/i;
            args[i+1] = "10";
        }catch (ArithmeticException e){ //перехват ошибки деления на ноль, не возникает, после того, как методу main было присвоено два аргумента
            System.out.println("Деление на ноль");
        }catch (ArrayIndexOutOfBoundsException e){//перехват ошибки: индекс за пределами массива, возникает, после того как методу main присвоено 2 аргумента
            System.out.println("Индекс не существует");
        }
    }
}
