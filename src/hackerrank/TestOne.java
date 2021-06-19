package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestOne {
    public static void main(String args[]) {

        List<Integer> list = IntStream.of(new int[60])
                .boxed()
                .collect(Collectors.toList());

        list.stream().forEach(i-> System.out.print(" " + i));
    }
}
