import java.util.*;
public class PrifexSum{
    public int[] sumArray(int[] nums){
       
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;

    }
    public static void main(String[] args){
        PrifexSum ps=new PrifexSum();
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(ps.sumArray(nums)));

    }
}
