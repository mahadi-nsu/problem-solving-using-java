public class FindMissingNumber {

    public static int missing(int[] data){
        int sum = 0;
        int total =0;
        for(int i=0;i<data.length;i++){
            sum = sum + data[i];
        }

        for(int i=1;i<=data.length+1;i++){
            total = total+i;
        }

        System.out.println(sum);
        System.out.println(total);
        return total-sum;

    }

    public static void main(String[] args){
        int[] data = {1,2,3,4,6};
//        int limit = 6;
        System.out.println("Missing data " + missing(data));
    }
}
