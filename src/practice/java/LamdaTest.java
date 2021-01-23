package practice.java;


import java.util.HashMap;
import java.util.Map;

public class LamdaTest {
    public static void main(String args[]) {
        HashMap<NewPerson, String> map = new HashMap<>();
        map.put(new NewPerson("Love City", "Param"), "First Book");
        map.put(new NewPerson("Love City", "Param"), "Second Book");

        for (Map.Entry<NewPerson, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
