import java.util.*;
public class ContainsDuplicate{
    public boolean Duplicate(int[] nums, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int diff=i-map.get(nums[i]);
                if(diff<=k){
                    return true;
                }
            }
             map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        ContainsDuplicate CD=new ContainsDuplicate();
        int[] nums={1,2,3,1};
        int k=3;
        System.out.println(CD.Duplicate(nums,k));
    }
}