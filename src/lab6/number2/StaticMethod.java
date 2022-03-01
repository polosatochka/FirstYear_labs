package lab6.number2;

public class StaticMethod {

    private static int something = 0;

    public static void increment (){
        for(int i = 0; i <= 10; i++) {
            System.out.println("Значение статического поля: " + something);
            something++;
        }
    }
}
