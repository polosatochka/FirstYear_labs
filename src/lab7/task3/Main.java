package lab7.task3;

public class Main {

    public static void main(String[] args) {
        SuperClass superObject = new SuperClass(2020);

        String superInfo = superObject.toString();
        System.out.println(superInfo);
        System.out.println("------------------------------------");

        SubClass subObject = new SubClass(2021, 'Y');

        String subInfo = subObject.toString();
        System.out.println(subInfo);
        System.out.println("------------------------------------");

        SecondSubClass secondSubObject = new SecondSubClass(2022, 'Z', "Tiger");

        String secondSubInfo = secondSubObject.toString();
        System.out.println(secondSubInfo);

    }
}
