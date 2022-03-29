package lab8.task1;

public class ProgrOne {

    public static void m1(int y) {
        System.out.println("y = " + y);
        if ((2 * y + 1) < 20) {
            m1(2 * y + 1);
        }
    }

    public static void m2(int x) {
        if ((2 * x + 1) < 20) {
            m2(2 * x + 1);
        }
        System.out.println("x = " + x);
    }


    public static void m3(int z) {
        System.out.println("" + z + "-->");
        if ((2 * z + 1) < 20) {
            m3(2 * z + 1);
        }
        System.out.println("" + z + "<--");
    }

    public static int m4(int w) {
        int result;
        if (w == 1)
            return 1;
        else {
            result = m4(w - 1) * w;
            return result;
        }
    }


    public static int m5(int v){
        if(v==0){
            return 0;}
        else if (v==1){
            return 1;}
        else {
            return m5(v-2)+m5(v-1);}
    }
}
