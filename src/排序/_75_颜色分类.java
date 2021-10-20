package 排序;

/**
 * @author wei junbin
 * @create 2021-09-16 13:53
 */
public class _75_颜色分类 {


    public void sortColors(int[] nums) {
        int i = 0;
        int l = 0;
        int r = nums.length - 1;
        while (i <= r) {
            int v = nums[i];
            if (v == 0) {
                swap(nums, i++, l++);

            } else if (v == 1) {
                i++;

            } else {
                swap(nums, i, r--);
            }
        }

    }
    private void swap(int[] nums, int i, int j){
        int tmp =nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;

    }



}
