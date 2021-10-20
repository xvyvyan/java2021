package 排序;

/**
 * @author wei junbin
 * @create 2021-09-16 15:23
 */
public class _面试题_16_16_部分排序 {
    public int[] subSort(int[] array) {
        if (array.length == 0) {
            return new int[]{-1, -1};

        }
        int max = array[0];
        int r = -1;
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            if (v >= max) {
                max = v;
            } else {
                r = i;

            }

        }
        int min = array[array.length - 1];
        int l = -1;
        for (int i = array.length - 2; i >= 0; i--) {
            int v = array[i];
            if (v <= min) {
                min = v;
            } else {
                l = i;

            }

        }
        return new int[]{l, r};


    }

}
