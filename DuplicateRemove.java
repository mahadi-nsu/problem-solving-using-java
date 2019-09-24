class DuplicateRemove{
    public static void main(String[] args){
        int[] data = {1,2,3,4,4,5};
        int length = data.length;
        boolean[] visited = new boolean[length];

        for(int i=0;i<length;i++){
            if(visited[data[i]]){
              for(int j=i;j<length-1;j++){
                  data[j] = data[j+1];
              }
            }
            visited[data[i]] = true;
        }

        for(int i=0;i<length-1;i++){
            System.out.println(data[i]);
        }

//        for(int i : data){
//            System.out.println(i);
//        }
    }
}