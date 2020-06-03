import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseIntArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        for(int i=0; i<arr.length/2;i++){
            int sub = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = sub;
        }

        Arrays.stream(arr).forEach(x -> System.out.print(x));
    }
}
