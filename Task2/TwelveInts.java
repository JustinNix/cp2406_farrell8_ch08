/**
 * Created by jc428352 on 1/09/17.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        for (int j = nums.length -1; j > -1; j--){
            System.out.print(nums[j] + ", ");
        }
    }
}
