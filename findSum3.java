//Sum using hash

import java.util.HashMap;
import java.util.Map;

public class findSum3 {
    public static void findpair(int[] data, int sum){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<data.length;i++){
            if(map.containsKey(sum - data[i])){
               System.out.println("pair found at index " +
                       map.get(sum - data[i]) + " and " + i);
               return ;
            }
            map.put(data[i] , i);
        }
    }

    public static void main(String[] args){
        int[] data = {8,2,5,4,4};
        int sum =8;
        findpair(data,sum);
    }
}
