import java.util.Arrays;
class Anagrams{
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        return true;
    }

//    public static void main(String[] args){
//        isAnagram("Mahadi" , "Hassan");
//    }
}