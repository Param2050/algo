package string;

public class Rotated {

    public static void main(String args[]) {
        if(new Rotated().isRotated("ABCD", "DABC"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private boolean isRotated(String str, String pattern) {
        if(str.length() != pattern.length())
            return false;

        for(int i=0; i<str.length(); i++) {
            String ch = str.substring(0, i+1);
            String newStr = str.substring(i+1)+ch;
            if(newStr.equals(pattern))
                return true;
        }
        return false;
    }
}


