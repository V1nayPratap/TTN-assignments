//Collect all the even numbers from an integer list.

import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> newlist = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(newlist);

    }
}