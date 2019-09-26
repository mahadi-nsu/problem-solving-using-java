//word reverse
//example => Input => Mahadi hassan tahsin Output => tahsin Hassan Mahadi

public class StringReverse {
    public static void main(String[] args){
        String data = "Mahadi Hassan tahsin";
        String[] new_data = data.split(" ");
        for(int i=new_data.length-1 ; i>=0;i--){
            System.out.print(new_data[i] + " ");
        }
    }

}
