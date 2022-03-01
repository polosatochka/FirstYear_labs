package lab6.number6;

public class NewArray {
    public static int[] buildArray (int[] nums, int i) {
        int[] result = new int[i];

        if(i <= nums.length) {
            for (int m = 0, n = 0; m < i; m++, n++) {
                result[m] = nums[n];
                System.out.println("Элемент массива [" + m + "] = " + result[m]);
            }
        }
        else if (i > nums.length) {
            for (int k = 0; k < nums.length; k++) {
                result[k] = nums[k];
                System.out.println("Элемент массива ["+k+"] = "+result[k]);
            }
        }
        return result;
    }

}
