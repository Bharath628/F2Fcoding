import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static void main(String[] args) {

        String[] arr = {"bharath", "suresh","ramesh","bolo"};
        LinkedList<String> list = new LinkedList<>(Arrays.asList(arr));
        list.stream().forEach(x -> System.out.println(x));

        list.descendingIterator().forEachRemaining(x -> System.out.println(x));


    }
}
