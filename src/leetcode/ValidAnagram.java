package leetcode;

public class ValidAnagram {

    public static void main(String args[]) {
        String str1 = "rat";
        String str2 = "tra";
        if(isAnagram(str1, str2)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int len = 26;
        int arr[] = new int[len];

        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int c : arr) {
            if(c != 0)
                return false;
        }

        return true;
    }
}
