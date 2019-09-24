public class findMissing2 {
    public static int find_missing(int[] data , int limit){
        int big = (limit * (limit+1))/2;
        int small = 0;
        for(int i=0;i<data.length;i++){
            small = data[i] + small;
        }
        return big - small;
    }

    public static void main(String[] args){
        int[] data = {1,2,3,4,6};
        int limit = 6;
        System.out.println("Missing data " + find_missing(data , limit));
    }

}
