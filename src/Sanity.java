import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sanity {
    public static void main(String[] args) {
        int arr[] = {3,3,1,2,8,9,6,3,4,5,6,7,8,9,3};
        ArrayList<Integer> alist = new ArrayList<>();
        int[] count = new int[10];
        for(int i=0;i<arr.length;i++){
            int currenVal = count[arr[i]];
            currenVal++;
            count[arr[i]] = currenVal;

        }

        for(int i=0;i<10;i++){
            int num = count[i];
            while(num>0){
                alist.add(i);
                num--;
            }
        }

        alist.stream().forEach(x-> System.out.println(x));
    }
}
