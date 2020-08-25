package hackerrank.string;

public class CaesarCipher {

    public static void main(String args[]) {
        String str = "middle-Outz";
        int k = 2;
        String result = caesarCipher(str, k);
        System.out.println(result);
    }

    static String caesarCipher(String str, int k) {
        k = k % 26;
        StringBuffer result = new StringBuffer();

        for (char letter: str.toCharArray()) {

            if(letter > 64 && letter < 91) { // check for capital letter

                char num = (char) (letter + k);
                if(num > 90) {
                    num = (char) ((num % 90) + 64);
                }
                result.append(num);

            } else if(letter > 96 && letter < 123) { // check for lowercase letter

                char num = (char) (letter + k);
                if(num > 122) {
                    num = (char) ((num % 122) + 96);
                }
                result.append(num);
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }

}
