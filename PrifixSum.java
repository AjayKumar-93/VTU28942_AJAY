import java.util.*;
public class PrifixSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arraysize");
        int n=sc.nextInt();
          int[] arr=new int[n];
          int[] prifex=new int[n];
        System.out.println("Enter the array values");
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prifex[0]=arr[0];
        for(int i=1;i<n;i++){
            prifex[i]=prifex[i-1]+arr[i];
        }
        System.out.println("Display the prifix sum");
        for(int i=0;i<n;i++){
            System.out.println("prifixsum "+ prifex[i]);
        }
        sc.close();

    }
    
}
