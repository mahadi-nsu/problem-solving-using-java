public class removeElement {
    public static void main(String[] args){
        int[] data = {1,2,3,4,5,6};
        int target_data = 2;
        for(int i=0;i<data.length;i++){
            if(data[i] == target_data)
            {
              for(int j=i ; j<data.length-1;j++){
                  data[j] = data[j+1];
//                  data[data.length] = 0;
              }
//              break;
            }
        }
        for(int i=0;i<data.length-1;i++){
            System.out.print(data[i]);
        }
     }
}
