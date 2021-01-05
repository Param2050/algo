package practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdaTest {
    public static void main(String args[]) {
        List<Person> personList = new ArrayList<Person>() {
            {
                add(new Person("Param", 32));
                add(new Person("Bharti", 34));
            }
        };

    }
}
