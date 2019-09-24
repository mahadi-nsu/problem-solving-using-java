//Using 1 loop

public class Duplicate2 {
    public static int findDuplicate(int[] data){
        boolean visited[] = new boolean[data.length+1];

        for(int i=0;i<data.length;i++){
            if(visited[data[i]]){
                return data[i];
            }
            visited[data[i]] = true;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] data = {1,2,3,4,4,5};
        System.out.println("Duplicate data  " + findDuplicate(data) );
    }
}
