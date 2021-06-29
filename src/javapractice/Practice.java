package javapractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Practice {

    public static void main(String args[]) {
        solve("aabcd", 2);
    }

    public static String solve(String str, int B) {

        HashMap<String, Integer> map =  new HashMap<String, Integer>();
        for(int i=0; i<str.length(); i++) {
            map.put(String.valueOf(str.charAt(i)), map.getOrDefault(String.valueOf(str.charAt(i)), 0)+1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == B) {
               entry.setValue(-1);
            }
        }

        String result = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() != -1) {
                result = result + entry.getKey();
            }
        }

        return result;
    }

}