
//using two loop
public class Duplicate {
    public static void main(String[] args){
        int[] data = {1,2,3,4,4,5};
        for(int i=0;i<data.length;i++){
            for(int j = i+1 ; j<data.length ;j++){
                if(data[i] == data[j]){
                    System.out.println("ans is "+ data[i]);
                }
            }
        }
    }
}
