import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ParrelStuff {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(55, "John");
        map.put(22, "Apple");
        map.put(66, "Earl");
        map.put(77, "Pearl");
        map.put(12, "George");
        map.put(6, "Rocky");

        List<String> list = new ArrayList<>();
        list.add("bhara");
        list.add("erer");
        list.add("asdasda");



        Function<String,Map<String,Integer>> fun = (x) -> {
            HashMap<String,Integer> hmap = new HashMap<>();
            hmap.put(x,x.length());
            return hmap;
        };

        HashMap<String,Integer> lmap = list.stream().collect(Collectors.toMap((x) -> x));


        lmap.forEach((x,y) -> System.out.println(x + " " + y) );
        Comparator<Map.Entry<Integer,String>> comparator = (q1,q2) -> q1.getValue().compareTo(q2.getValue());
        Predicate<Map.Entry<Integer,String>> pfun = (x) -> x.getValue().equalsIgnoreCase("Applhe");


        lmao.forEach((x,y)-> System.out.println(x + "||" + y));
    }
}
