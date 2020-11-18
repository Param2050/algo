package hackerrank.dict_hashmaps;


import java.util.HashMap;
import java.util.Map;

// Not completed*********************************************
public class RansomNote {

    public static void main(String args[]) {
        String magazine[] = {"h", "ghg", "g", "xxy", "h", "h"};
        String note[] = {"h", "ghg"};
        checkMagazine(magazine, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        for(int i=0; i<magazine.length; i++) {
            if(magazineMap.containsKey(magazine[i])) {
                magazineMap.put(magazine[i], magazineMap.get(magazine[i]) + 1);
            } else {
                magazineMap.put(magazine[i], 1);
            }
        }

        for(int i=0; i<note.length; i++) {
            if(noteMap.containsKey(note[i])) {
                noteMap.put(note[i], noteMap.get(note[i]) + 1);
            } else {
                noteMap.put(note[i], 1);
            }
        }

        boolean flag = true;
        for(Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            if(!magazineMap.containsKey(entry.getKey())) {
               flag = false;
               break;
            }else if(magazineMap.containsKey(entry.getKey())) {
                if(entry.getValue() > magazineMap.get(entry.getKey()) ) {
                    flag = false;
                    break;
                }
            }
         }

        if(flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

}
