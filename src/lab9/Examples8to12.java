package lab9;

public class Examples8to12 {

    public static int m() {
        try {
            System.out.println("8. Генерация исключения в методе");
            System.out.println("0");
          //  throw new RuntimeException();//самостоятельно генерируем исключение
        } finally {
            System.out.println("1"); //оператор finally всегда выполняется
        }
        return 0;
    }

    public static int m1(){
        try{
            System.out.println("9. Дополнительное использование оператора return");
            System.out.println("0");
            return 55; //выход из метода
        } finally {
            System.out.println("1");  //оператор finally здесь уже не выполняется
        }
    }

    public static int m2(){
        try{
            System.out.println("10. Использование оператора return в try и finally");
            System.out.println("0");
            return 15;
        } finally { //оператор finally здесь выполняется
            System.out.println("1");
            return 20; //выход из метода
        }
    }


    public static void m3(String s, double num){
        System.out.println("12. Неверные аргументы");
        if(s == null){
            throw new IllegalArgumentException("Строка введена неверно"); //самостоятельно генерируем исключение
        }
        if(num > 0.001){
            throw new IllegalArgumentException("Неверное число"); //самостоятельно генерируем  еще одно исключение
        }
        System.out.println("Ошибки не возникло");
    }






}
