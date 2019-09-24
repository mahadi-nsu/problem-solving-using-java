import java.util.Arrays;

public class FindSumCombination2 {
   public static void main(String [] args){
       int[] data = {5,2,8,1,3};
       int sum = 9;
       findPair(data,sum);
   }
   public static void findPair(int[] data , int sum){
       int length = data.length;
       Arrays.sort(data);
       int low =0;
       int high = length-1;
       while(low < high){
           if(data[low] + data[high] ==sum){
               System.out.println("The pair is " + data[low] + " and " + data[high]);
           }
           if(data[low] + data[high] > sum){
               high--;
           }
           else{
               low++;
           }
       }
   }
}
