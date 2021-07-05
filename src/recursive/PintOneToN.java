package recursive;

public class PintOneToN {
    public static void main(String args[]) {
        int n = 7;
        new PintOneToN().printOneToNNumbers(n);
    }

    private void printOneToNNumbers(int n) {
        if(n == 1)
            return;

        printOneToNNumbers(n-1);
        System.out.print(" " + n);
    }

}
