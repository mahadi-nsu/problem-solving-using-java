public class ArrayContainData {
    public static boolean find_data(int[] all_data , int expected_data){
        for (int i = 0; i < all_data.length; i++) {
            if(all_data[i] == expected_data){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] data = {1,4,3};
        int expected = 2;
        System.out.println(find_data(data,expected));
    }
}
