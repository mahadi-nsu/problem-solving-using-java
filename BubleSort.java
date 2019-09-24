public class BubleSort {
    public static void main(String[] args) {
        int[] data = {1,6,3,2,6,8};
        for(int i : data){
            System.out.println(i);
        }
        int length = data.length;
        for(int k=0 ; k<length-1;k++){
            for(int i =0;i<length-1;i++){
                if(data[i] > data[i+1]){
                    int temp;
                    temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
        }
       for(int i=0;i<length;i++){
           System.out.println("Afetr" + data[i]);
       }
    }

}

//Time complexity O(n^2)
