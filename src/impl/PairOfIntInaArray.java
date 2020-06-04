package impl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PairOfIntInaArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,8,9,0,4,6};

        int sum = 3;
        Arrays.sort(arr);
        HashSet<Integer> set = IntStream.of(arr).boxed()
                                .collect(Collectors.toCollection(HashSet::new));

        OptionalInt sp = IntStream.of(arr).max();

        System.out.println(sp.orElse(0));

        for(int s:arr){
            int diff = Math.abs(sum - s);
            if(set.contains(diff) && s <= sum) {
                System.out.println(s + " " + diff);

            }

        }

    }
}
