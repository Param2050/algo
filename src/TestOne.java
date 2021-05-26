
public class TestOne {
    public static void main(String args[]) {
        String str = "Hello";
        try {
            double value = Double.parseDouble(str);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
