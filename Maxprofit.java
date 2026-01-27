public class Maxprofit {
    public static int Maxprofits(int[] arr){
        int maxprice=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minprice){
                minprice=arr[i];
            }
            else if(arr[i]-minprice>maxprice){
                maxprice=arr[i]-minprice;
            }
           
        }
         return maxprice;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int[] arr1={7,6,5,4,3,2};
        int ans=Maxprofits(arr);
        int ans1=Maxprofits(arr1);
        System.out.println(ans);
         System.out.println(ans1);
    }
}
    
