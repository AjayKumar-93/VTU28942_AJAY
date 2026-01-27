public class Firstuniquechar {
    public static int Firstunique(String s){
    //     for(int i=0;i<s.length();i++){
    //         int count=0;
    //         for(int j=0;j<s.length();j++){
    //             if(s.charAt(i)==s.charAt(j)){
    //                 count++;
    //             }
    //         }
    //         if(count==1){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }


    //USING FREQUENCY COUNT O(N)-> TIME COMPLEXCITY//
    
    int[] count=new int[26];
    for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
    }
    for(int i=0;i<s.length();i++){
        if(count[s.charAt(i)-'a']==1){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
     String s="leetcode" ;
     int ans=Firstunique(s);
     System.out.println(ans);  
    }
    
}
