public class FindSumCombination {
    public static void findSum(int[] data , int sum){
        int i,j;
        for(i = 0; i<data.length ; i++) {
            for (j = i+1; j < data.length; j++) {
                if (data[i] + data[j] == sum) {
                    System.out.println("pair founds at " + i + " and " + j + " position \n and datas are " + data[i] + "," + data[j]);
                }
            }
        }
        System.out.println("pair not found");
    }

   public static void main(String[] args){
        int data[] = {1,2,3,4,5,6};
        int sum = 5;
        findSum(data,sum);
   }
}
