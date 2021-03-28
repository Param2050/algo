package string;

public class RemoveAllAdjacentDuplicates {

    public static void main(String[] args) {
        String str = "mississipie";
        String res = new RemoveAllAdjacentDuplicates().removeDuplicates(str);
        System.out.println("Resulted String :" + res);
    }

    public String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        int strLen = 0;
        for(Character ch : str.toCharArray()){
            if(strLen !=0 && ch == sb.charAt(strLen-1)) {
                sb.deleteCharAt(strLen-1);
                strLen--;
            }else{
                sb.append(ch);
                strLen++;
            }
        }
        return sb.toString();
    }
}