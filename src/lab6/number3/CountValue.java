package lab6.number3;

public class CountValue {

    public static void minMaxAverage(int... nums) {
        int sum = 0;

        if (nums.length > 0) {
            int max = nums[0];

            for (int x : nums) {
                if (x > max) {
                    max = x;
                }
            }
            System.out.println("Наибольшее значение: " + max);

            for (int z : nums) {
                int min = nums[0];
                System.out.println("Наименьшее значение :" + min);
                break;
            }

            int average = 0;
            for (int t : nums) {
                average = ((sum += t) / nums.length);
            }
            System.out.println("Среднее значение: " + average);
        }
    }

    public static void minMaxAverage2(int[] mass) {
        int sum2 = 0;

        if (mass.length > 0) {
            int max2 = mass[0];

            for (int y : mass) {
                if (y > max2) {
                    max2 = y;
                }
            }
            System.out.println("Наибольшее значение: " + max2);

            for (int r : mass) {
                int min2 = mass[0];
                System.out.println("Наименьшее значение :" + min2);
                break;
            }

            int average2 = 0;
            for (int s : mass) {
                average2 = ((sum2 += s) / mass.length);
            }
            System.out.println("Среднее значение: " + average2);
        }
    }
}
