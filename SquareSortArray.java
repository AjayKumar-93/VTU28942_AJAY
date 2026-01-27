import java.util.*;
public class SquareSortArray{
    public static int[] squareArray(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=arr[i]*arr[i];
             System.out.print(result[i]+" ");
        }
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        int[] ans=squareArray(arr);
        System.out.println("SquareSortingArray"+Arrays.toString(ans));
    }
}
