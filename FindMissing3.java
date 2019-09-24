public class FindMissing3 {

    public static int find_missing(int[] data , int N){
           int sum = (N*(N+1))/2;
           for(int i=0;i<data.length;i++){
               sum = sum - data[i];
           }
           return sum;
        }

    public static void main(String[] args){
        int[] data = {1,2,3,4,6};
        int limit = 6;
        System.out.println("Missing data " + find_missing(data , limit));
    }
}
